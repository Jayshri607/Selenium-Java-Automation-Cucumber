package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginwithdatasteps {

	@Given("user should be login page")
	public void user_should_be_login_page() {
		System.out.println("Given statmenent");
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String uname) {
		System.out.println("Username is:" +uname);
	    
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pwd) {
		System.out.println("Password is:"+pwd);
	    
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("User clicked on submit button");
	    
	}

	@Then("User logged into the application")
	public void user_logged_into_the_application() {
		System.out.println("User logged in");
	    
	}



}
