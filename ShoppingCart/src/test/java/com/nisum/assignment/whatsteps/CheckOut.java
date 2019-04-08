package com.nisum.assignment.whatsteps;

import org.jbehave.core.annotations.When;

import com.nisum.assignment.howsteps.CheckOutSteps;

import net.thucydides.core.annotations.Steps;

public class CheckOut {
	
	@Steps
	CheckOutSteps checkOutSteps;

	@When("adds the product in the cart")
	public void addsTheProducyInTheCart()
	{
		checkOutSteps.addTheProductInCart();
	}
	
}
