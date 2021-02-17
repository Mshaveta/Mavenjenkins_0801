package com.qa.sut.testClasses;

import static com.qa.sut.utility.ReadConfigProp.readProp;

import org.testng.annotations.Test;

import com.qa.sut.pages.HomePage;

public class HomeTest extends BaseTest {
	HomePage hp ;

	@Test
	public void verifyLogOut() throws InterruptedException {
		//S1: BrowserLuanch and app launch
		//S2: login 
		//S3: logout
		 
		String uname=readProp("admin_username");
		String pass=readProp("admin_pwd");
		hp=lp.loginWithValidCred(uname,pass);
		
		
		//Thread.sleep(5000);
		//lp = hp.logOut();
		
		//lp.loginWithValidCred();
		
		
		
	}
}
