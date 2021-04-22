package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.JavaScriptHelper;

/*Script Author: Narender
 * Date :16/4/2021
 * Reviewed By: narender
 * Code checked in: No
 */

public class LoginPage extends DriverScript{
// *******************Page Elements**********************************************************//
	@FindBy(xpath = "//div[@class='atLogoImg']") WebElement actiLogo;
	@FindBy(id = "username") WebElement usernameTB;
	@FindBy(name = "pwd") WebElement passwordTB;
	@FindBy(id = "loginButton") WebElement loginBtn;

//*******************Element Initialization************************************************//
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
// ******************Page Actions************************************************************//
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public void validateLogin(String username, String password)
	{
		JavaScriptHelper.highlightElement(usernameTB);
		usernameTB.sendKeys(username);
		JavaScriptHelper.highlightElement(passwordTB);
		passwordTB.sendKeys(password);
		loginBtn.click();
	}
}
