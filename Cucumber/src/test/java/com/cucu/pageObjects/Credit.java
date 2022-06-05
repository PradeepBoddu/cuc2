package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Credit {
	WebDriver driver;
	public Credit(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div/a/strong")
	WebElement cr;
	
	public WebElement cr1()
	{
		return cr;
	}

}
