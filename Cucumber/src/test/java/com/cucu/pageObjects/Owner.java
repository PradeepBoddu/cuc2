package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Owner {
	WebDriver driver;
	public Owner(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"pypAd\"]/button")
	WebElement ow;
	
	public WebElement ow1()
	{
		return ow;
	}

}
