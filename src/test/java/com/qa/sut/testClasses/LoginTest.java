package com.qa.sut.testClasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.qa.sut.utility.ReadConfigProp.*;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLogin() {
		String uname=readProp("admin_username");
		String pass=readProp("admin_pwd");
		lp.loginWithValidCred(uname,pass);
	}
	
	@Test(priority=0)
	public void verifyPageTitle() {
		String actLpTitle = lp.getPageTitle();
		String expLpTitle = "OrangeHRM"; 
		Assert.assertEquals(expLpTitle, actLpTitle,"Not Matched!");
	
	}
}
