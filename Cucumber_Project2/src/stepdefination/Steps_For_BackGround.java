package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_For_BackGround 
{
	
	@Given("^gmail homepage$")
	public void gmail_homepage() throws Throwable {
	    System.out.println("gmail homepage displayed");
	}

	@Given("^login into account$")
	public void login_into_account() throws Throwable {
	    System.out.println("login into account");
	}

	@Given("^Search email$")
	public void search_email() throws Throwable {
	   System.out.println("Search email");
	}

	@Then("^verify reply screen displayed$")
	public void verify_reply_screen_displayed() throws Throwable {
	    System.out.println("Reply screen launched"+"\n");
	}

	@Then("^verify forward screen displayed$")
	public void verify_forward_screen_displayed() throws Throwable {
	    System.out.println("Fotward screen launched"+"\n");
	}
	
	@When("^user click on delete button$")
	public void user_click_on_delete_button() throws Throwable {
	    System.out.println("user click deleted button");
	}

	@Then("^verify email deleced option shoudl display$")
	public void verify_email_deleced_option_shoudl_display() throws Throwable {
	   System.out.println("delete option displayed");
	}


}
