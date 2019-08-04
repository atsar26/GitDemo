package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1_Basic extends Base {

	
	@Test
	public void verifyLogin() throws Exception {
		
		driver = initializeDriver();
	
		HomePageLogin h = new HomePageLogin(driver);
		
		h.userId().sendKeys("mngr208757");
		h.password().sendKeys("qYgAvYd");
		h.loginButton().click();
	}
	
	@AfterTest
	public void getHomePageTitle() throws Exception {
	driver.getTitle();
	System.out.println("Title is: "+driver.getTitle());
	}

}
