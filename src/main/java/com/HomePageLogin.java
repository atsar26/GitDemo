package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLogin {
	
	WebDriver driver;
	HomePageLogin(WebDriver dr){
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="uid")
	WebElement userId;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(name="btnLogin")
	WebElement submit;
	
	
	 public WebElement  userId() {
<<<<<<< HEAD
		 System.out.println("UserID....get!!!");
=======
		 
		 System.out.println("UserID....!!!"+userId);
>>>>>>> a4c32bd474facd4ff95581f23b7a823ab5e37457
		 return userId;
	 }

	 public WebElement  password() {
<<<<<<< HEAD
		 System.out.println("Password..get!!!");
=======
		 System.out.println("GitStuff");
		 System.out.println("Password....!!!"+password);
>>>>>>> a4c32bd474facd4ff95581f23b7a823ab5e37457
		 return password;
	 }
	 
	 public WebElement  loginButton() {
		 return submit;
	 }
}
