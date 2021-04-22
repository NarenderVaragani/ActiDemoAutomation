package com.acti.TestCases;

import org.testng.annotations.Test;

public class TC03_AddNewUser extends PreTest {
	
	@Test
	public void validateCreateUser() throws InterruptedException
	{
		launchApp();
		lp.validateLogin("admin", "manager");
		ettp.clickUserMenu();
		usp.ClickNewUserBtn();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usp.createNewUser("Test", "test1","email@test.com" );
	}

}
