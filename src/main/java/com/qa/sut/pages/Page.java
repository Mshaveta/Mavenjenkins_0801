package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page extends BasePage {
	 

	public Page(WebDriver driver) {
		super(driver);
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement pageElement = driver.findElement(locator);
		return pageElement;

	}

	 

}
