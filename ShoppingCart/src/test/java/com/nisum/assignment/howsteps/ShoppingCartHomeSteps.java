package com.nisum.assignment.howsteps;

import com.nisum.assignment.pages.ShoppingCartHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ShoppingCartHomeSteps extends ScenarioSteps{
	
	ShoppingCartHomePage shoppingCartHomePage;

	@Step
	public void launchTheApplication()
	{
		shoppingCartHomePage.openHomePage();
	}

	@Step
	public void selectTeaKettleUnderCookwareSection()
	{
		shoppingCartHomePage.MouseHoverOnCoockwareLink();
		shoppingCartHomePage.clickOnTeaKettleLink();
	}
	
}
