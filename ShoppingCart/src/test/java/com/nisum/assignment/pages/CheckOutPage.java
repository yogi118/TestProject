package com.nisum.assignment.pages;

import org.openqa.selenium.WebDriver;

import com.nisum.assignment.common.util.Common;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckOutPage extends PageObject{

	@FindBy(xpath = "(.//div[@class='addcart-options']/descendant-or-self::button)[1]")
	WebElementFacade addToCartButton;
	
	public void clickOnAddToCartButton() 
	{
		addToCartButton.click();
	}
	
	public void ScrollDownTillAddToCartButton()
	{
		new Common().scrollElementIntoView(this.getDriver(), addToCartButton);
	}
}
