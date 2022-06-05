package com.cucu.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	WebDriver driver;
	public Profile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"searchCity\"]/div/div[1]/div")
	WebElement pra;
	//@FindBy(xpath="//*[@id=\"profile-menu-dropdown\"]/a[1]")
	//WebElement pro;
	
	
	public WebElement pra1()
	{
		return pra;
	}

}
