package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		System.out.println("user_enter_application_url()");
	}
	
	@Given("^go to landing page$")
	public void go_to_landing_page() throws Throwable {
		System.out.println("goes to landing page");
	}

	@When("^user enter application url$")
	public void user_enter_application_url(String url) throws Throwable {
		String string = FileReaderManager.getInstance().getConfigInstance().geturl();
		getUrl(url);
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		sendkeys(pom.getLp().getusername(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		sendkeys(pom.getLp().getpassword(), arg1);
	}

	@Then("^user verify the username in the homepage$")
	public void user_verify_the_username_in_the_homepage() throws Throwable {
		clickElemenet(pom.getLp().loginbuttton());
		System.out.println("login get succeed");
	}

	@Given("^user select the location$")
	public void user_select_the_location() throws Throwable {
		clickElemenet(pom.getSh().getLocation());
	}

	@Given("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		clickElemenet(pom.getSh().getHotel());
	}

	@Given("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		clickElemenet(pom.getSh().getRoomtype());
	}

	@Given("^user select the no of rooms$")
	public void user_select_the_no_of_rooms() throws Throwable {
		clickElemenet(pom.getSh().getNoOFRooms());
	}

	@Given("^user select the adults per room$")
	public void user_select_the_adults_per_room() throws Throwable {
		clickElemenet(pom.getSh().getAdults());
	}

	@Given("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		clickElemenet(pom.getSh().getChildren());
	}

	@Then("^user verify the valid search details have passed$")
	public void user_verify_the_valid_search_details_have_passed() throws Throwable {
		clickElemenet(pom.getSh().getSearchbutton());
		System.out.println("search hotel is completed");
	}

	@Given("^user select the hotel name$")
	public void user_select_the_hotel_name() throws Throwable {
		clickElemenet(pom.getSlh().getRadiobutton());
	}

	@Then("^user verify the valid select details have passed$")
	public void user_verify_the_valid_select_details_have_passed() throws Throwable {
		clickElemenet(pom.getSlh().getSelectbutton());
		System.out.println("user selected the hotel");
	}

	@Given("^user enter the firstname$")
	public void user_enter_the_firstname() throws Throwable {
		clickElemenet(pom.getBh().getFirstname());
	}

	@Given("^user enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
		clickElemenet(pom.getBh().getLastname());
	}

	@Given("^user enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
		clickElemenet(pom.getBh().getAddress());
	}

	@Given("^user enter the creditcard number$")
	public void user_enter_the_creditcard_number() throws Throwable {
		clickElemenet(pom.getBh().getCardnumber());
	}

	@Given("^user enter the creditcard type$")
	public void user_enter_the_creditcard_type() throws Throwable {
		clickElemenet(pom.getBh().getCardtype());
	}

	@Given("^user enter the creditcard expiry date$")
	public void user_enter_the_creditcard_expiry_date() throws Throwable {
		clickElemenet(pom.getBh().getExpirydate());
		clickElemenet(pom.getBh().getExpiryyear());
	}

	@Given("^user enter the creditcard cvv number$")
	public void user_enter_the_creditcard_cvv_number() throws Throwable {
		clickElemenet(pom.getBh().getCvv());
	}

	@Then("^user verify the booking  details have passed$")
	public void user_verify_the_booking_details_have_passed() throws Throwable {
		clickElemenet(pom.getBh().getBookbutton());
		System.out.println("hotel is booked");

	}

}
