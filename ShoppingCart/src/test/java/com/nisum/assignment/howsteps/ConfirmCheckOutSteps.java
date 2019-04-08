package com.nisum.assignment.howsteps;

import com.nisum.assignment.pages.ConfirmCheckOutPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ConfirmCheckOutSteps extends ScenarioSteps{
	
	ConfirmCheckOutPage confirmCheckOutPage;
	
	@Step
	public void completCheckoutProcedure() 
	{
		confirmCheckOutPage.clickOnCheckoutButton();
	}

}
