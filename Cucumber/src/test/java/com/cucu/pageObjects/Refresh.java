package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Refresh {
	WebDriver driver;
	public Refresh(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"navHeader\"]/div[2]/div/img")
	WebElement rf;
	
	public WebElement rf1()
	{
		return rf;
	}

}
