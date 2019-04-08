package com.nisum.assignment.howsteps;

import com.nisum.assignment.pages.CheckOutPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckOutSteps extends ScenarioSteps{
	CheckOutPage checkOutPage;
	
	@Step
	public void addTheProductInCart()
	{
		checkOutPage.clickOnAddToCartButton();
	}

}
