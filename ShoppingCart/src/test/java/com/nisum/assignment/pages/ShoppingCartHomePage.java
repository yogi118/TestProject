package com.nisum.assignment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShoppingCartHomePage extends PageObject{
	
	@FindBy(xpath = ".//ul[@class='nav-menu']/descendant-or-self::a[@class='topnav-cookware ']")
	WebElementFacade cookwareNavigatorMenu;
	
	@FindBy(xpath = "(.//*[contains(text(),'Tea Kettles')])[1]")
	WebElementFacade teaKettleLink;
	
	public void MouseHoverOnCoockwareLink()
	{
		Actions actions = new Actions(this.getDriver());
		actions.moveToElement(cookwareNavigatorMenu).build().perform();
		this.waitABit(2000);
	}
	
	public void clickOnTeaKettleLink()
	{
		teaKettleLink.click();
	}
	
	public void openHomePage()
	{
		WebDriver driver = this.getDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		this.open();
	}
}
