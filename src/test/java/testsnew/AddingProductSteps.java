package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductSteps {
	
	String productid;
	
	
	public String getproductid() {
		return productid;
		
	}
	@Given("I am at the home pagee")
	public void i_am_at_the_home_pagee() {
		System.out.println("Given statement");
	
	}
	   

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
		System.out.println("Clicked on addto cart button");
	    
	}

	@Then("Product should get added")
	public void product_should_get_added() {
	    System.out.println("Product added");
	     productid = "trytry";
	}


	

}
