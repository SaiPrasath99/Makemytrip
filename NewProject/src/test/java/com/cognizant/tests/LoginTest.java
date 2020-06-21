package com.cognizant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cognizant.base.TestBase;
import com.cognizant.pages.Loginpage;

public class LoginTest extends TestBase{
	
	Loginpage loginpage;
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
