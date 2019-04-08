package com.nisum.assignment.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ConfirmCheckOutPage extends PageObject{
	
	@FindBy(xpath = ".//a[@id='anchor-btn-checkout']")
	WebElementFacade checkOutButton;

	public void clickOnCheckoutButton()
	{
		checkOutButton.click();
	}
}
