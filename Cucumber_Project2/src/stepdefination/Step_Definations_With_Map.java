package stepdefination;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class Step_Definations_With_Map 
{

	
	
	
	@When("^User enters Credentials to search prodcut$")
	public void user_enters_Credentials_to_search_prodcut(DataTable usercredentials) throws Throwable {
	  
			for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) 
			{
						String UID=data.get("Username");
						String PWD=data.get("Password");
						
						System.out.println(UID+"   "+PWD);
			}
	}


}
