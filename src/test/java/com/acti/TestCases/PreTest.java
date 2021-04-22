package com.acti.TestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.Helper.General;
import com.acti.Pages.EnterTimePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.UserListPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class PreTest extends DriverScript {
	
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	
	LoginPage lp;
	EnterTimePage ettp;
	UserListPage usp;
	 
	
	public PreTest()
	{
		super();//super is a keyword in Java used to call or initialize the parent class constructor
	}

	@BeforeMethod
	public void setUp()
	{
		//Step1. we need to create object of 2 classes.	Create an object of Extent Reports
		htmlReport = new ExtentHtmlReporter("./actiReports/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		
		
		initBrowser();
		lp=new LoginPage();
		ettp=new EnterTimePage();
		usp=new UserListPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		
		try{
			if (result.getStatus()== ITestResult.FAILURE)
			{
				String screenshotPath = General.getScreenshot (driver, "screenShotName"); 
				logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:",ExtentColor.RED));
				logger.fail(result.getThrowable());

				logger.fail("Snapshot below: " + logger.addScreenCaptureFromPath(screenshotPath));
		}
		}
			catch(Exception e)
			{
			System.out.println("An exception occured" +e);
			}
		driver.close();
		extent.flush();
	}
	
}
