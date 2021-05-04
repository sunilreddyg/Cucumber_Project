package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/background_test.feature",
glue="stepdefination",monochrome=true,dryRun=false)
public class Run_BackGround_Test 
{

}
