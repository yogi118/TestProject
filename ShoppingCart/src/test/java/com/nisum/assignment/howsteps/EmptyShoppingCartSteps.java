package com.nisum.assignment.howsteps;

import com.nisum.assignment.pages.EmptyShoppingCartPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class EmptyShoppingCartSteps extends ScenarioSteps{
	
	EmptyShoppingCartPage paymentPage;
	
	@Step
	public void saveForLaterLink()
	{
		paymentPage.clickOnSaveForLaterLink();
	}
	
	@Step
	public boolean verifyItemIsSaved(String message) 
	{
		String actualMessage = paymentPage.saveForLaterMessage();
		return message.equals(actualMessage);
	}

}
