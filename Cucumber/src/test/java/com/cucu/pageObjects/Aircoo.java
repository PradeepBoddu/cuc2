package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aircoo {
	WebDriver driver;
	public Aircoo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"acRepairHomeTile\"]/img")
	WebElement ac;
	@FindBy(xpath="//*[@id=\"appPortal\"]/div/div[2]/div/div/div/div[2]/div[11]/img")
	WebElement ca;
	
	public WebElement ac1()
	{
		return ac;
	}
	public WebElement ca1()
	{
			return ca;
	}

}
