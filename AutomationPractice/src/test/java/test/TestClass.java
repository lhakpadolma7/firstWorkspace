package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.Util;

public class TestClass {
	
	@Test
	public void testing() {
		
		WebDriver driver; 

		SingletonDriver sd = SingletonDriver.getClassInstance();
		
		 sd.openBrowser("chrome", "http://automationpractice.com/index.php");
		
		Util ut = new Util();
		
		ut.closeAllBrowser();

	}
}
