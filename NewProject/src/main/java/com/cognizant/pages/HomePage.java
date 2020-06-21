package com.cognizant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//li[contains(@class,'menu_Cabs')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement cabsbtn;
	
	@FindBy(xpath = "//li[contains(@class,'menu_Giftcards')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement giftcardsbtn;
	
	@FindBy(xpath = "//li[contains(@class,'menu_Hotels')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement hotelsbtn;
	
    public HomePage() {
		
		 PageFactory.initElements(driver, this);
	}
    
    public CabsPage click_Cabs_button() {
    	
    	cabsbtn.click();
    	return new CabsPage();
    }
    
    public GiftcardsPage click_giftcards_button() {
    	
    	cabsbtn.click();
    	return new GiftcardsPage();
    }
    
    public HotelbookingPage click_hotels_button() {
    	
    	cabsbtn.click();
    	return new HotelbookingPage();
    }



}
