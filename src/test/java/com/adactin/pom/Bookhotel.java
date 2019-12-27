package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel extends BaseClass {

	@FindBy(xpath="//input[@id='first_name']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@id='address']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	public WebElement cardnumber;
	
	@FindBy(xpath="//input[@id='cc_type']")
	public WebElement cardtype;
	
	@FindBy(xpath="//input[@id='cc_exp_month']")
	public WebElement expirydate;
	
	@FindBy(xpath="//input[@id='cc_exp_year']")
	public WebElement expiryyear;
	
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	public WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	public WebElement bookbutton;
	
	public Bookhotel(WebDriver bdriver) {
		Bookhotel.driver=bdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirydate() {
		return expirydate;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbutton() {
		return bookbutton;
	}

}
