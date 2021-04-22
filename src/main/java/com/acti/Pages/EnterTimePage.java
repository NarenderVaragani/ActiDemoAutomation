package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

/*Script Author: Narender
 * Date :16/4/2021
 * Reviewed By: narender
 * Code checked in: No
 */

public class EnterTimePage extends DriverScript{

//*******************PageElements**********************************************************//

	@FindBy(id = "logoutLink") WebElement logoutLink;
	@FindBy(id="container_users") WebElement usersMenu;
	@FindBy(xpath="//a[@class='content selected tt']") WebElement timeTrackMenu;
	@FindBy(xpath="//a[@class='content tasks']") WebElement taskMenu;
	@FindBy(xpath="//a[@class='content reports']") WebElement reportsMenu;
	
//*******************Element Initialization************************************************//

			public EnterTimePage() {
				PageFactory.initElements(driver, this);
			}
			//******************Page Actions************************************************************//
			
			public String verifyEnterTimePageTitle() 
			{
				return driver.getTitle();
			}
			public void clickLogoutLink()
			{
				logoutLink.click();
			}
	
			public boolean verifyClickUserMenu()
			{
				return usersMenu.isDisplayed();
				
			}
			
			public void clickUserMenu()
			{
				usersMenu.click();
				
			}
			
			public boolean verifytimeTrackMenu()
			{
				return timeTrackMenu.isDisplayed();
			}
	
			public boolean verifyTaskMenu()
			{
				return taskMenu.isDisplayed();
			}
			
			public boolean verifyReportsMenu()
			{
				return reportsMenu.isDisplayed();
			}

}
