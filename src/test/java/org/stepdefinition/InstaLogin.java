package org.stepdefinition;

import org.base.BaseClass;
import org.base.FbLogin;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstaLogin extends BaseClass {
	WebDriver driver;

	@Given("To launch the browser and windows maximized")
	public void to_launch_the_browser_and_windows_maximized() {

		LaunchBrowser();
		WindowsMaximize();
	}

	@When("To launch the Valid url")
	public void to_launch_the_Valid_url() {
		LaunchUrl("https://en-gb.facebook.com/");

	}

	@When("To find the locator of username field")
	public void to_find_the_locator_of_username_field() throws InterruptedException {
	    FbLogin f = new FbLogin();
	    passtext("12333", f.getEmail());
	}

	@When("To find the locator of password field")
	public void to_find_the_locator_of_password_field() {
		FbLogin f = new FbLogin();
		passtext("ccvfevvr", f.getPass());
		
		

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		FbLogin f = new FbLogin();
		clickbtn(f.getLogbtn());
		}

	@When("To check whether navigate to search page or not")
	public void to_check_whether_navigate_to_search_page_or_not() {
		System.out.println("to check the navigate page");

	}

	@Then("To close entire browser")
	public void to_close_entire_browser() {
		closebrowser();

	}

}
