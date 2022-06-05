package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Property {
	WebDriver driver;
	public Property(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"headerHouseOwner\"]/span")
	WebElement fr;
	
	public WebElement fr1()
	{
		return fr;
	}

}
