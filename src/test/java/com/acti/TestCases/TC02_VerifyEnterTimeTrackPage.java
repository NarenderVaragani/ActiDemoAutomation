package com.acti.TestCases;

import org.testng.annotations.Test;

public class TC02_VerifyEnterTimeTrackPage extends PreTest {

	@Test
	public void testEnterTimeMenuDisplayed()
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		boolean flag = ettp.verifytimeTrackMenu();
		System.out.println(flag);
	}
	
	@Test(priority=2)
	public void testUserMenuDsiplayed()
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		boolean flag = ettp.verifyClickUserMenu();
		System.out.println(flag);
	}
	
	@Test(priority=3)
	public void testTimeTrackMenuDsiplayed()
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		boolean flag = ettp.verifytimeTrackMenu();
		System.out.println(flag);
	}
	
	@Test(priority=4)
	public void testTaskMenuDisplayed()
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		boolean flag = ettp.verifyTaskMenu();
		System.out.println(flag);
	}
	
	@Test(priority=5)
	public void testReportsMenuDisplayed()
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		boolean flag = ettp.verifyReportsMenu();
		System.out.println(flag);
	}
	
}
