package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdifinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
		
	@Given("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		 String launchurl = FileReaderManager.getInstance().getConfigInstance().launchurl();
		    getUrl(launchurl);
	}
	
	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    sendKeys(pom.getLp().getUsername(), arg1);
	}

	@And("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    sendKeys(pom.getLp().getPassword(), arg1);
	}

	@Then("^goes to the landing page$")
	public void goes_to_the_landing_page() throws Throwable {

	    clickElemenet(pom.getLp().getLoginbtn());
	}

	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		dropdown(pom.getSh().getLocation(), "Melbourne");
	}

	@And("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		dropdown(pom.getSh().getHotel(), "Hotel Sunshine");

	}

	@And("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		dropdown(pom.getSh().getRoomtype(), "Standard");
	}

	@And("^user select the no of rooms$")
	public void user_select_the_no_of_rooms() throws Throwable {
		dropdown(pom.getSh().getNoOFRooms(), "2 - Two");
	}

	@And("^user select the adults per room$")
	public void user_select_the_adults_per_room() throws Throwable {
		dropdown(pom.getSh().getAdults(), "2 - Two");
	}

	@And("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		dropdown(pom.getSh().getChildren(), "2 - Two");
	}

	@Then("^user verify the valid search details have passed$")
	public void user_verify_the_valid_search_details_have_passed() throws Throwable {
	    clickElemenet(pom.getSh().getSearchbutton());
	}

	@When("^user select the hotel name$")
	public void user_select_the_hotel_name() throws Throwable {
	    radioButton(pom.getSlh().getRadiobutton());
	}

	@Then("^user verify the valid select details have passed$")
	public void user_verify_the_valid_select_details_have_passed() throws Throwable {
	    clickElemenet(pom.getSlh().getSelectbutton());
	}

	@When("^user enter the firstname$")
	public void user_enter_the_firstname() throws Throwable {
	    sendKeys(pom.getBh().getFirstname(), "taml");
	}

	@And("^user enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
	    sendKeys(pom.getBh().getLastname(), "selva");
	}

	@And("^user enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
	    sendKeys(pom.getBh().getAddress(), "adayar,chennai");
	}

	@And("^user enter the creditcard number$")
	public void user_enter_the_creditcard_number() throws Throwable {
	    sendKeys(pom.getBh().getCardnumber(), "1234567899874563");
	}

	@And("^user enter the creditcard type$")
	public void user_enter_the_creditcard_type() throws Throwable {
		dropdown(pom.getBh().getCardtype(), "VISA");
	}

	@And("^user enter the creditcard expiry date$")
	public void user_enter_the_creditcard_expiry_date() throws Throwable {

		 dropdown(pom.getBh().getExpirydate(), "May");
		    dropdown(pom.getBh().getExpiryyear(), "2012");
		    
	}

	@And("^user enter the creditcard cvv number$")
	public void user_enter_the_creditcard_cvv_number() throws Throwable {
	    sendKeys(pom.getBh().getCvv(), "555");
	}

	@Then("^user verify the booking details have passed$")
	public void user_verify_the_booking_details_have_passed() throws Throwable {
	    clickElemenet(pom.getBh().getBookbutton());
	}
}
