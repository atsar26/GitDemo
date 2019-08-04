package com;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test2_Parametrization extends Base {

	@Test(dataProvider="getData")
	public void validCredentials(String userId, String password) throws Exception {

		String actualBoxMsg;
		
		driver=initializeDriver();
		
        
       HomePageLogin h = new HomePageLogin(driver);
		
		h.userId().sendKeys(userId);
		h.password().sendKeys(password);
		h.loginButton().click();

/*		String actual = driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText();
		assertEquals(actual, "Manger Id : mngr208757");
		System.out.println("Test 1 Assertion Completed....!");
*/	
		
		
		 try{ 
		       	Alert alt = driver.switchTo().alert();
				actualBoxMsg = alt.getText(); // get content of the Alter Message
				alt.accept();
				 // Compare Error Text with Expected Error Value					
				assertEquals(actualBoxMsg,"User or Password is not valid");
				System.out.println("Done for "+userId +"and " +password);
				
			}    
		    catch (NoAlertPresentException Ex){ 
		    	// Get text displayes on login page 
		    	String actual = driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText();
				assertEquals(actual, "Manger Id : mngr208757");
				System.out.println("Test 1 Assertion Completed....!");
				System.out.println("Correct uname and pass:: "+userId +"and " +password);
	        } 
	}

	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		//Object[][] data = new Object[1][2];

		data[0][0] = "mngr208757";
		data[0][1] = "qYgAvYd";

		data[1][0] = "mngr208757";
		data[1][1] = "pass";

		data[2][0] = "uname3";
		data[2][1] = "qYgAvYd";

		data[3][0] = "uname4";
		data[3][1] = "pass";

		return data;
	}

	
	@AfterTest
	public void tearDown() throws Exception{
		driver.close();
	}
	
}
