package com.nisum.assignment.dataloader;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.pages.PageObject;

public class Initializer extends PageObject {
	
	WebDriver driver = null;
	@BeforeStories
	public void lauchDriver()
	{
		//Initialization code if required
	}
	
	@AfterStories
	public void killDriverInstance()
	{
		driver = this.getDriver();
		
		if(driver != null)
		{
			driver.close();
		}
	}
}
