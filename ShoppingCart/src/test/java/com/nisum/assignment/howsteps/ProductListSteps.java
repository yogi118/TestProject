package com.nisum.assignment.howsteps;

import com.nisum.assignment.pages.ProductListPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductListSteps extends ScenarioSteps{
	
	ProductListPage productListPage;
	
	@Step
	public void selectTheFirstProduct()
	{
		productListPage.clickOnFirstProduct();
	}

}
