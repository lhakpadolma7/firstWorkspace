package main;

import org.openqa.selenium.WebDriver;

public class Util  {

//	public Util(WebDriver driver) {
//		super(driver);
//	}

	SingletonDriver sd = SingletonDriver.getClassInstance();
	WebDriver driver = sd.getDriver();
	
	public void closeCurrentBrowser() {
		
		driver.close();
	}
	
	public void closeAllBrowser() {
		
		driver.quit();
	}
	

}
