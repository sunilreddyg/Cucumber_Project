package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Datatable.feature",
glue="stepdefination",monochrome=true)
public class Run_DataTable {

}
