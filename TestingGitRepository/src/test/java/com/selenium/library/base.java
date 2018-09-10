package com.selenium.library;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class base {
	public static WebDriver driver;
	public static seleniumLibrary myLibrary;
	
@BeforeMethod
	public void beforeEachTest() {
	myLibrary.startChromeBrowser();
		
	}
@AfterMethod

public void afterEachTest () {
	
		if (driver != null) {
		driver.quit();
	}
}
}
