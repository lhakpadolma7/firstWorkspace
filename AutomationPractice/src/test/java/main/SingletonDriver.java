package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver {

	//Singleton class is a class where we make sure we pass on same instance of the object
	//Here we wanna pass same driver
	//Q- If we create a singleton driver class, what would be the limitation for the testing?

	public SingletonDriver(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver openBrowser(String browser, String url) {

		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
		}

		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
		}

		else {
			System.out.println("Incorrect browser >_<");
		}
		return driver;
	}


















}
