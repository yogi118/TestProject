package com.nisum.assignment.whatsteps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.nisum.assignment.howsteps.EmptyShoppingCartSteps;

import net.thucydides.core.annotations.Steps;

public class EmptyShoppingCart {
	
	@Steps
	EmptyShoppingCartSteps paymentSteps;
	
	@When("the user clicks the Save for later link in shopping cart page")
	public void userClicksTheSaveForLaterLinkInShoppingCartPage()
	{
		paymentSteps.saveForLaterLink();
	}
	
	@Then("you have '$expectedMessage' link shoud be displayed")
	public void test(String expectedMessage)
	{
		boolean status = paymentSteps.verifyItemIsSaved(expectedMessage);
		Assert.assertTrue("1 item is not saved",status); 
	}
}
