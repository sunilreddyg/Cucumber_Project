package stepdefination;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Datatable {


	@Given("^user navigate to homepage$")
	public void user_navigate_to_homepage() throws Throwable {
	   System.out.println("Hi User at homepage");
	}

	@When("^User completed login$")
	public void user_completed_login() throws Throwable {
	   System.out.println("Login details entry sucessfull");
	}

	@When("^user click search records$")
	public void user_click_search_records() throws Throwable 
	{
		System.out.println("Search button clicked");
	}

	@When("^User enters Credentials to search$")
	public void user_enters_Credentials_to_search(DataTable usercredentials) throws Throwable {
	   
	    List<List<String>> data=usercredentials.raw();
	    //Get first row data
	    String username=data.get(1).get(0);
	    String password=data.get(1).get(1);
	    
	    //Get sceond row data
	    String UID2=data.get(2).get(0);
	    String PWD2=data.get(2).get(1);
	    
	    System.out.println(username+"  "+password);
	    System.out.println(UID2+" "+PWD2);
	    
	}

	@Then("^Record display at result window$")
	public void record_display_at_result_window() throws Throwable {
	    System.out.println("Record details displayed");
	}

}
