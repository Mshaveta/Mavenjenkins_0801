package com.qa.sut.testClasses;

import static com.qa.sut.utility.ReadConfigProp.readProp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.sut.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	static WebDriver driver;
	LoginPage lp;
	@BeforeClass
	public void launchBrowser() {
		
		String browserName = readProp("browser");
		String appUrl = readProp("appUrl");
		
		//Hard Assertion
		Assert.assertEquals("chrome", browserName);
		// Step1: Browser Launch
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		// Launch App
		driver.get(appUrl);
		
		lp = new LoginPage(driver);//1
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	 
}
