package com.cucu.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucu.pageObjects.Aircoo;
import com.cucu.pageObjects.Credit;
import com.cucu.pageObjects.Locality;
import com.cucu.pageObjects.Login;
import com.cucu.pageObjects.Menu;
import com.cucu.pageObjects.Owner;
import com.cucu.pageObjects.Profile;
import com.cucu.pageObjects.Property;
import com.cucu.pageObjects.Refresh;
import com.cucu.pageObjects.Rent;
import com.cucu.utilities.ReadProperties;
import com.cucu.utilities.Snapshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin {
	WebElement e;
	Actions action;
	WebDriver driver;
	Credit c;
	Aircoo A;
	Locality L;
	Login g;
	Menu M;
	Owner O;
	Profile P;
	Property y;
	Refresh Re;
	Rent R;
	ReadProperties prop=new ReadProperties();
	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	
		
	   
	}
	@When("user opens url {string}")
	public void user_opens_url(String string) throws IOException {
		c=new Credit(driver);
		driver.get("https://www.nobroker.in/");
		Snapshot.getScreenshot(driver,"user");
	
	   
	}
	@And("click on Credit")
	public void click_on_Credit() throws InterruptedException {
		c.cr1().click();
		Thread.sleep(5000);
	    
	}
	@Then("close browser")
	public void close_browser() {
		driver.quit();

	    
	}
	@When("click on Aircoo")
	public void click_on_Aircoo() throws InterruptedException {
		A= new Aircoo(driver);
		A.ac1().click();
		Thread.sleep(3000); 
	   
	}

	@When("click on Locality")
	public void click_on_Locality() throws InterruptedException {
		L= new Locality(driver);
		L.lo1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Login")
	public void click_on_login() throws InterruptedException {
		g= new Login(driver);
		g.ln1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Menu")
	public void click_on_Menu() throws InterruptedException {
		M=new Menu(driver);
		M.mn1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Owner")
	public void click_on_owner() throws InterruptedException {
		O= new Owner(driver);
		O.ow1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Profile")
	public void click_on_Profile() throws InterruptedException {
		P= new Profile(driver);
	
		P.pra1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Property")
	public void click_on_property() throws InterruptedException {
		y=new Property(driver);
		y.fr1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Refresh")
	public void click_on_Refresh() throws InterruptedException {
		Re= new Refresh(driver);
		Re.rf1().click();
		Thread.sleep(3000); 
	   
	}
	@When("click on Rent")
	public void click_on_bulkorder() throws InterruptedException {
		R=new Rent(driver);
		R.re1().click();
		Thread.sleep(3000); 
	   
	}


}
