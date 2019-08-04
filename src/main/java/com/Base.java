package com;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Base {
	
	
	public static WebDriver driver;
	
	@Test
	public WebDriver initializeDriver() throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Atish\\Guru99Project\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String URL = prop.getProperty("URL");
		
		//for Google Chrome 
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//for Firefox 
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.firefox.marionette", "E:\\\\JAVA\\\\Selenium\\\\chromedriver_win32\\\\geckodriver.exe");
			//firefox
			driver = new FirefoxDriver();
		}
		
		//for Internet Explore
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\\\JAVA\\\\Selenium\\\\chromedriver_win32\\\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		//Wait after initiating driver
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		driver.get(URL);

		return driver;
	}
	
	
	
	
	
}

