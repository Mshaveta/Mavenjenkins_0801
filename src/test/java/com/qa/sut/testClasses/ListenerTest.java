package com.qa.sut.testClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.sut.pages.BasePage;

public class ListenerTest extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());
		try {
			String screenShotfp = System.getProperty("user.dir")+"\\Screenshots\\1.png";
			BasePage.captureSnapShot(driver,screenShotfp);
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}
}
