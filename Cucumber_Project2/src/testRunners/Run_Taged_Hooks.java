package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Taged_Hook.feature",
glue="",monochrome=true,dryRun=false)
public class Run_Taged_Hooks {



}
