package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	
	
		@FindBy(xpath="//select[@id='location']")
		public WebElement location;
		
		@FindBy(xpath="//select[@id='hotels']")
		public WebElement hotel;
		
		@FindBy(xpath="//select[@id='room_type']")
		public WebElement roomtype;

		@FindBy(xpath="//select[@id='room_nos']")
		public WebElement noOFRooms;
		
		@FindBy(xpath="//select[@id='adult_room']")
		public WebElement adults;

		@FindBy(xpath="//select[@id='child_room']")
		public WebElement children;
		
		@FindBy(xpath="//input[@id='Submit']")
		public WebElement searchbutton;
		
		
		public SearchHotel(WebDriver sdriver) {
			SearchHotel.driver=sdriver;
			PageFactory.initElements(driver, this);
			
			
		}


		public WebElement getLocation() {
			return location;
		}


		public WebElement getHotel() {
			return hotel;
		}


		public WebElement getRoomtype() {
			return roomtype;
		}


		public WebElement getNoOFRooms() {
			return noOFRooms;
		}


		public WebElement getAdults() {
			return adults;
		}


		public WebElement getChildren() {
			return children;
		}


		public WebElement getSearchbutton() {
			return searchbutton;
		}
		
	

	
	
	
	
	

	
}
