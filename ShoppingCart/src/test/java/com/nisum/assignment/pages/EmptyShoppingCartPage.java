package com.nisum.assignment.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class EmptyShoppingCartPage extends PageObject{

	@FindBy(xpath = ".//a[contains(text(),'Save For Later')]")
	WebElementFacade saveForLaterLink;
	
	@FindBy(xpath = ".//p[@class='save-for-later-message']/a")
	WebElementFacade saveForLaterMessage;
	
	public void clickOnSaveForLaterLink()
	{
		saveForLaterLink.click();
	}
	
	public String saveForLaterMessage()
	{
		return saveForLaterMessage.getText();
	}
}
