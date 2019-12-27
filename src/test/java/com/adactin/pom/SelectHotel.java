package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	@FindBy(xpath="(//input[contains(@name,'radio')]")
	public WebElement radiobutton;
	
	@FindBy(xpath="(//input[contains(@name,'continue')]")
	public WebElement selectbutton;
	
	
	public SelectHotel(WebDriver sdriver) {
		SelectHotel.driver=sdriver;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getSelectbutton() {
		return selectbutton;
	}
	
	
}
