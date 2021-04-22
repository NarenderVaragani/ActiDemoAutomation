package com.acti.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC01_ValidateLogin extends PreTest {
	
	
	@Test(priority=1)
	public void testPageTitle()
	{
		logger=extent.createTest("Verify Page Title");
		launchApp();
		logger.log(Status.PASS,"Launched the application");
		String title = lp.verifyLoginPageTitle();
		Assert.assertEquals("actiTIME - Login",title);
		logger.log(Status.PASS,"Title is verified");
	}

	@Test(priority=2)
	public void testActiLogo()
	{
		logger=extent.createTest("Verify ActiLogo page");
		launchApp();
		logger.log(Status.PASS,"Launched the application");
		boolean flag = lp.verifyActiLogo();
		System.out.println(flag);
		logger.log(Status.PASS,"Logo is verified succefully");
	}
	@Test(priority=3)
	public void testLoginFunctionality()
	{
		logger=extent.createTest("Verify Login functionality of the page");
		launchApp();
		logger.log(Status.PASS,"Launched the application");
		logger.log(Status.INFO,"Entered Username");
		logger.log(Status.INFO,"Entered Password");
		logger.log(Status.INFO,"Clicked on Login button");
		lp.validateLogin("admin", "manager");
		logger.log(Status.PASS,"validated the login page successfully");
	}
}
