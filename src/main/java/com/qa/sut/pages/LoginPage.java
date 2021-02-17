package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {
	
	 
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginBtn = By.xpath("//input[@id='btnLogin']");
	
	
	public WebElement getuNameTxtField() {
		return getElement(username);
	}
	
	public WebElement getPwdTxtField() {
		return getElement(password);
	}
	
	public WebElement getLoginBtn() {
		WebElement loginBtnWebElm = getElement(loginBtn);
		return loginBtnWebElm;
	}
	
	//login functionality
	public HomePage loginWithValidCred(String uname,String pwd) {
		getuNameTxtField().sendKeys(uname);
		getPwdTxtField().sendKeys(pwd);
		getLoginBtn().click();
		// return the object of HomePage
		HomePage homePage = new HomePage(driver);
		return homePage;
	}
	
	
	
	
	
	
	
}
