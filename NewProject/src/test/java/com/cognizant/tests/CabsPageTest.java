package com.cognizant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cognizant.base.TestBase;
import com.cognizant.pages.CabsPage;
import com.cognizant.pages.Loginpage;

public class CabsPageTest extends TestBase{

	Loginpage loginPage;
	CabsPage cabsPage;
	
	public CabsPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		cabsPage = new CabsPage();
		loginPage = new Loginpage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test
	public void testCabsPage() throws InterruptedException {
		
		cabsPage.insideCabsPage();
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}
	
}
