package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources1/features/User_login.feature",
glue="stepdefination")
public class Junit_Runner_User_login 
{
	
	

}
