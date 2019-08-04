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
		 return userId;
	 }

	 public WebElement  password() {
		 return password;
	 }
	 
	 public WebElement  loginButton() {
		 return submit;
	 }
}