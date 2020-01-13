package com.stepDefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase {
	
	LoginPage loginpage;
	HomePage home;
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	    TestBase.init();
	}

	@Then("^user is Present on Login Page$")
	public void user_is_Present_on_Login_Page() throws Throwable {
		loginpage=new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Facebook – log in or sign up", title);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	   loginpage.enterUsernameandpassword(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    home= loginpage.clickOnLoginBtn();
	}

	@Then("^Validate the home page title$")
	public void validate_the_home_page_title() throws Throwable {
		String hometitle=home.verifyHomePageTitle();
		  Assert.assertEquals("Facebook", hometitle);
	    
	}

}
