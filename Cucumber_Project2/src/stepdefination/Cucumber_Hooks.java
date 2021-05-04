package stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Cucumber_Hooks 
{
	
	//@Before(order=1) //Order 2 run second
	public void Pre_Condition()
	{
		System.out.println("---------PreCondition Executed-----------");
		
	}
	
	//@Before(order=0) //ORder 0 run first
	public void Pre_Condition_for_method()
	{
		System.out.println("---------PreCondition method Executed-----------");
		
	}
	
	
	//@After(order=0)  //IR run second 
	public void Post_Condition_for_method()
	{
		System.out.println("---------Post Condition methodExecuted----------");
	}

	
	//@After(order=1)    //It Run first Before Order 0
	public void Post_Condition()
	{
		System.out.println("---------Post Condition Executed----------");
	}


}
