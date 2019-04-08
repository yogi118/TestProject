package com.nisum.assignment.whatsteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import com.nisum.assignment.howsteps.ShoppingCartHomeSteps;

import net.thucydides.core.annotations.Steps;

public class ShoppingCartHome {

	@Steps
	ShoppingCartHomeSteps shoppingCartHomeSteps;

	@Given("the user is on the product home page")
	public void userIsInOnTheProductHommePage() {
		shoppingCartHomeSteps.launchTheApplication();
	}

	@When("the user selects tea kettles uder cookware")
	public void userSelectsTeaKettlesUnderCoockware() {
		shoppingCartHomeSteps.selectTeaKettleUnderCookwareSection();
	}
}
