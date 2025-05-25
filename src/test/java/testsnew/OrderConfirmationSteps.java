package testsnew;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {
	
	AddingProductSteps aps;
	public OrderConfirmationSteps (AddingProductSteps pid){
		aps=pid;
		
	}

	@When("I click on order place")
	public void i_click_on_order_place() {
		System.out.println("Placed the order");
	    
	}

	@Then("Order should get placed")
	public void order_should_get_placed() 
	{
	   System.out.println("Order placed successfully");
	    String productidplace = aps.getproductid();
	    System.out.println("Product id is :" +productidplace);
	}

}
