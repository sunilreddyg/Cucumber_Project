package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Order_hooks.feature",
glue="stepdefination",monochrome=true,dryRun=false)
public class Run_Order_Hooks {

}
