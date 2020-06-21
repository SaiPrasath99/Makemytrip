package com.cognizant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cognizant.base.TestBase;
import com.cognizant.pages.GiftcardsPage;
import com.cognizant.pages.Loginpage;

public class GiftcardsPageTest extends TestBase{
	
	Loginpage loginPage;
	GiftcardsPage giftcardsPage;
	
public GiftcardsPageTest() {
		
		super();
	}

@BeforeMethod
public void setUp() throws InterruptedException {
	initialization();
	giftcardsPage = new GiftcardsPage();
	loginPage = new Loginpage();
	loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	
}

@Test
public void testCabsPage() throws InterruptedException {
	
	giftcardsPage.insideGiftcardsPage();
}

@AfterMethod
public void closeBrowser() {
	
	driver.quit();
}


}
