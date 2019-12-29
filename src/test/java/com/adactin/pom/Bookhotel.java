package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.BaseClass;

public class Bookhotel extends BaseClass {

	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirydate;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookbutton;
	
	public Bookhotel(WebDriver bdriver) {
		this.driver=bdriver;
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
