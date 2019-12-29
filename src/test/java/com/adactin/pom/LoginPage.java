package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath ="//input[@id='login']")
	private WebElement loginbtn;
	
	
	public LoginPage (WebDriver Ldriver)
	{
		this.driver=Ldriver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
