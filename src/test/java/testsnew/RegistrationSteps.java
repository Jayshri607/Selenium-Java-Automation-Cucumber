package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable ;

public class RegistrationSteps {

	@Given("User in account page")
	public void user_in_account_page() {
		System.out.println("Given statement");
	   
	}

	@When("User enter following details")
	public void user_enter_following_details(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		List<String> firstlist = data.get(1);
		String firstname = firstlist.get(0);
		System.out.println(firstname);
		System.out.println("Firstlist is: "+firstlist);
		 String mobilenumber = firstlist.get(3);
		 System.out.println("Mobile number is: "+mobilenumber);
		System.out.println("User data is :" +data);
		String last = data.get(1).get(1);
		System.out.println("last:"+last);
		System.out.println("******************************************");
		List<Map<String, String>> Mapdata = dataTable.asMaps();
		Map<String, String> firstindex = Mapdata.get(1);
		System.out.println("First index is:"+firstindex);
		String lastname = firstindex.get("Lastname");
		System.out.println("Lastname is:"+lastname);
		
	
		
		
		
	}

	@When("user clciks on submit button")
	public void user_clciks_on_submit_button() {
		System.out.println("Clicked on submit button");
	    
	}

	@Then("User should get confirmation")
	public void user_should_get_confirmation() {
		System.out.println("Confirmation message");
	    
	}




}
