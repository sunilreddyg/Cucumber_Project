package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Taged_Hooks 
{
	@Given("^First step$")
	public void first_step() throws Throwable {
	    System.out.println("First step executed");
	}

	@When("^Second step$")
	public void second_step() throws Throwable {
	   System.out.println("Second Step executed");
	}

	@Then("^third step$")
	public void third_step() throws Throwable {
	    System.out.println("Thrird step executed");
	}
}
