package stepdefination;

import cucumber.api.java.en.Given;

public class Steps_for_Run_Tags 
{
	@Given("^url flights page$")
	public void url_flights_page() throws Throwable 
	{
	    System.out.println("flights page opened");
	}

	@Given("^url trins page$")
	public void url_trins_page() throws Throwable 
	{
		System.out.println("Trains page opened");
	}

	@Given("^url packages page$")
	public void url_packages_page() throws Throwable 
	{
		System.out.println("Packages page opened");
	}

	@Given("^url BUS page$")
	public void url_BUS_page() throws Throwable 
	{
		System.out.println("Bus page opened");
	}

	@Given("^url Cars page$")
	public void url_Cars_page() throws Throwable {
	    System.out.println("cars paged opened");
	}

	@Given("^url Product page$")
	public void url_Product_page() throws Throwable {
		System.out.println("Rroducts page opened");
	}

}
