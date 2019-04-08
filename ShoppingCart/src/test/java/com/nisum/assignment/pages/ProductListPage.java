package com.nisum.assignment.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductListPage extends PageObject{
	
	@FindBy(xpath = "(//span[@class='product-thumb-casing'])[1]")
	WebElementFacade firstProduct;
	
	public void clickOnFirstProduct()
	{
		firstProduct.click();
	}
}
