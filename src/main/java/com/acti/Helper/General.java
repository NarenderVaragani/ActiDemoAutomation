package com.acti.Helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.acti.Base.DriverScript;

public class General extends DriverScript{
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
//		after execution, you could see a folder "FailedTest"
//		under src folder
		
		String destination=System.getProperty("user.dir") + "/FailedTest/" +screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
//		returns the captured file path
		return destination;
		
		
		
	}

}
