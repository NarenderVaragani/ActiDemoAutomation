package com.acti.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverScript {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public DriverScript()
	{
		try {

			prop = new Properties();
			fis = new FileInputStream("./actiConfiguration/Config.properties");
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("File Not Found");
		}
	}
	
	
	public static void initBrowser() {
		String browser = prop.getProperty("Browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./actiBrowser/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./actiBrowser/geckodriver.exe");
			driver = new FirefoxDriver();
		} 

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}
	
	public static void launchApp()
	{
		String URL = prop.getProperty("QAURL");
		driver.get(URL);
	}
	
}
