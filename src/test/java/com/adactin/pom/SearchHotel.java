package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.BaseClass;

public class SearchHotel extends BaseClass {

	
	
		@FindBy(id="location")
		private WebElement location;
		
		@FindBy(xpath="//select[@id='hotels']")
		private WebElement hotel;
		
		@FindBy(xpath="//select[@id='room_type']")
		private WebElement roomtype;

		@FindBy(xpath="//select[@id='room_nos']")
		private WebElement noOFRooms;
		
		@FindBy(xpath="//select[@id='adult_room']")
		private WebElement adults;

		@FindBy(xpath="//select[@id='child_room']")
		private WebElement children;
		
		@FindBy(xpath="//input[@id='Submit']")
		private WebElement searchbutton;
		
		
		public SearchHotel(WebDriver sdriver) {
			this.driver=sdriver;
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
