package stepdefination;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User_Signup_Steps 
{
	
	
	@Before
	public void Launch_Chrome()
	{
		System.out.println("Chrome browser get launched");
	}
	
	@Given("^outlook site url$")
	public void outlook_site_url() throws Throwable 
	{
	    System.out.println("SIte url opened outlook");
	}

	@Given("^click Create Account button$")
	public void click_Create_Account_button() throws Throwable 
	{
	    System.out.println("Create button get clicked");
	}

	@When("^user type username \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_type_username_and_password_as(String UID, String PWD) throws Throwable 
	{
	    System.out.println("username entered is --> "+UID);
	    System.out.println("Password entered is --> "+PWD);
	}

	@When("^click Create account button$")
	public void click_Create_account_button() throws Throwable 
	{
	    System.out.println("Create Account button clicked");
	}

	@Then("^display message \"([^\"]*)\"$")
	public void display_message(String arg1) throws Throwable 
	{
	    System.out.println("successfull message displayed");
	}



}
