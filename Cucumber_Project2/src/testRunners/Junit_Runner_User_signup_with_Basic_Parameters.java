package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/usersignup.feature",
glue="stepdefination",monochrome=true,dryRun=false)
public class Junit_Runner_User_signup_with_Basic_Parameters
{
	
	
}
