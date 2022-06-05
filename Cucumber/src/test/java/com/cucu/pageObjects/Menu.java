package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	WebDriver driver;
	public Menu(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"main-menu\"]/div[1]")
	WebElement mn;
	
	public WebElement mn1()
	{
		return mn;
	}


}
