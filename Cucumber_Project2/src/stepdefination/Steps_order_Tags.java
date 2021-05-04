package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_order_Tags 
{
	
	@When("^user click on reply button$")
	public void user_click_on_reply_button() throws Throwable {
	    
		System.out.println("user click on reply button");
	}

	@Then("^verify Reply page displayed$")
	public void verify_Reply_page_displayed() throws Throwable {
	    System.out.println("verify reply page displayed");
	}

	@When("^user click on forward button$")
	public void user_click_on_forward_button() throws Throwable {
	    System.out.println("user click on forwared button");
	}

	@Then("^verify forward page displayed$")
	public void verify_forward_page_displayed() throws Throwable 
	{
		System.out.println("Verifying forward page displayed");
	}

}
