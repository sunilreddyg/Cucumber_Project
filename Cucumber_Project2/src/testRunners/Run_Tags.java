package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Feature_With_Tags.feature",
glue="stepdefination",monochrome=true,dryRun=false,tags= {"@SmokeTest,@Reg"})
public class Run_Tags 
{
	
	
	/*
	 * Inorder to run tags with OR
	 * 
	 *   @CucumberOptions(tags={"@Tagname1,@Tagname2"})
	 *   
	 *  INorder to run both tags
	 *  @CucumberOptions(tags={"@Tagname1","@Tagname2"})
	 *  
	 *  Skip tags
	 *  @CucumberOptions(tags={"@Tagname1","~@Tagname2"})
	 */
}
