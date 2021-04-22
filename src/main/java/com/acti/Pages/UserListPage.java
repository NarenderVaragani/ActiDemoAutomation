package com.acti.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.Base.DriverScript;
import com.acti.Helper.JavaScriptHelper;

/*Script Author: Narender
 * Date :18/4/2021
 * Reviewed By: narender
 * Code checked in: No
 */

public class UserListPage extends DriverScript {
// *******************Page Elements**********************************************************//
	
		@FindBy(xpath="//div[contains(@class,'withPlusIcon')]") WebElement newUserBtn;
		@FindBy(id="createUserPanel_firstNameField") WebElement firstnameTB;
		@FindBy(id="createUserPanel_lastNameField") WebElement lastnameTB;
		@FindBy(id="createUserPanel_emailField") WebElement emailTB;
		
		 
		
// *******************Element Initialization************************************************//
		
		public UserListPage()
		{
			PageFactory.initElements(driver, this);
		}

		// ******************Page Actions************************************************************//
		
		public void ClickNewUserBtn() throws InterruptedException
		{
			JavaScriptHelper.highlightElement(newUserBtn);
			newUserBtn.click();
			Thread.sleep(3000);
			
		}
		
		public void createNewUser(String fn,String ln, String em)
		{
						
			firstnameTB.click();
			JavaScriptHelper.highlightElement(firstnameTB);
			firstnameTB.sendKeys(fn);
			JavaScriptHelper.highlightElement(lastnameTB);
			lastnameTB.sendKeys(ln);
			JavaScriptHelper.highlightElement(emailTB);
			emailTB.sendKeys(em);
			
		}
		
}
