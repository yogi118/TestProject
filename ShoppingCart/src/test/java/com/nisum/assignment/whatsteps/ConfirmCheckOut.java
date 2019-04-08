package com.nisum.assignment.whatsteps;

import org.jbehave.core.annotations.When;

import com.nisum.assignment.howsteps.ConfirmCheckOutSteps;

import net.thucydides.core.annotations.Steps;

public class ConfirmCheckOut {
	
	@Steps
	ConfirmCheckOutSteps confirmCheckOutSteps;

	@When("the user completes the checkout procedure")
	public void userCompletesTheCheckoutProcedure()
	{
		confirmCheckOutSteps.completCheckoutProcedure();
	}
}
