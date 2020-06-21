package com.cognizant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cognizant.base.TestBase;
import com.cognizant.pages.HotelbookingPage;
import com.cognizant.pages.Loginpage;

public class HotelsPageTest extends TestBase{
	
	Loginpage loginPage;
	HotelbookingPage hotelpage;
	
	
    public HotelsPageTest() {
		
		super();
	}
    
    @BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		hotelpage = new HotelbookingPage();
		loginPage = new Loginpage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
    @Test
    public void testHotelsPage() throws InterruptedException {
    	
    	hotelpage.insideHotelBookingsPage();
    }
    
    @AfterMethod
    public void closeBrowser() {
    	
    	driver.quit();
    }
	

}
