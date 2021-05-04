package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Sample_Example_For_outline.feature",
glue="stepdefination",monochrome=true)
public class Run_scenario_Outline 
{

}
