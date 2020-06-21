package com.cognizant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cognizant.base.TestBase;
import com.cognizant.pages.HomePage;
import com.cognizant.pages.Loginpage;

public class HomePageTest extends TestBase{
	
Loginpage loginpage;
HomePage homePage;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new Loginpage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority='1')
	public void checkcabsbutton() {
		
		homePage.click_Cabs_button();
	}
	
	@Test(priority='2')
	public void checkgiftcardsbutton() {
		
		homePage.click_Cabs_button();
	}
	
	@Test(priority='3')
	public void checkhotelsbutton() {
		
		homePage.click_Cabs_button();
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
