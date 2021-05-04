package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_For_Scenario_Outline 
{
	@Given("^url at browser window$")
	public void url_at_browser_window() throws Throwable 
	{
	   System.out.println("browser get launched");
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String Username, String Password) throws Throwable 
	{
	    System.out.println(Username+" "+Password);
	}
	@Then("^error messaage displayed$")
	public void error_messaage_displayed() throws Throwable 
	{
	   System.out.println("Error message displayed");
		
	}


}
