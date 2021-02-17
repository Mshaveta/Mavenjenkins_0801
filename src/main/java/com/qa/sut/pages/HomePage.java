package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {
	private By welLink    = By.id("welcom");
	private By logoutLink = By.xpath("//a[contains(@href,'logout')]");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private WebElement getWelLink() {
		return getElement(welLink);
	}

	private WebElement getLogoutLink() {
		return getElement(logoutLink);
	}
	
	public LoginPage logOut() throws InterruptedException {
		getWelLink().click();
		Thread.sleep(2000);
		getLogoutLink().click();
		return new LoginPage(driver);
	}

	 
	
	

}
