package com.nisum.assignment.whatsteps;

import org.jbehave.core.annotations.When;

import com.nisum.assignment.howsteps.ProductListSteps;

import net.thucydides.core.annotations.Steps;

public class ProductList {
	
	@Steps
	ProductListSteps productListSteps;
	
	@When("the user selects the first tea kettle product")
	public void userSelectsTheFirstTeaKettleProduct()
	{
		productListSteps.selectTheFirstProduct();
	}
}
