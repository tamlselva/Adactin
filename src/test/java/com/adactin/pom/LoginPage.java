package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath ="//input[@id='login']")
	public WebElement loginbtn;
	
	
	public LoginPage (WebDriver Ldriver)
	{
		LoginPage.driver=Ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getusername() {
		return username;	
	}
	
	
	public WebElement getpassword() {
		return username;	
	}
	
	
	public WebElement loginbuttton() {
		return username;	
	}
}
