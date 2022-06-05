package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locality {
	WebDriver driver;
	public Locality(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"listPageSearchLocality\"]")
	WebElement lo;
	
	public WebElement lo1()
	{
		return lo;
	}


}
