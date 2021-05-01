package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User_login_Steps 
{
	WebDriver driver;
	String url="http://facebook.com";
	
	@Given("^site url at chrome browser$")
	public void site_url_at_chrome_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\grid\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("^user enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password() throws Throwable {
	   
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello");
	}

	@When("^click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
	    System.out.println("Signin button get clicked");
	}

	@Then("^Account Page should be Displayed$")
	public void account_Page_should_be_Displayed() throws Throwable {
	    System.out.println("HOmepage displayed");
	}


}
