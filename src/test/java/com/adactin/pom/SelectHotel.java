package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.BaseClass;

public class SelectHotel extends BaseClass {
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement selectbutton;
	
	
	public SelectHotel(WebDriver sdriver) {
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getSelectbutton() {
		return selectbutton;
	}


	
}
