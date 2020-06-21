package com.cognizant.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.base.TestBase;

public class HotelbookingPage extends TestBase{
	
	@FindBy(xpath = "//li[contains(@class,'menu_Hotels')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement hotelsbtn;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/"
			+ "div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]")
	WebElement select_city;
	
	@FindBy(xpath = "//input[@id='guest']")
	WebElement guests_dropdown;
	
	@FindBy(xpath = "//div[contains(@class,'widgetSection appendBottom40')]//ul[1]")
	WebElement guests_count;
	
	 public HotelbookingPage() {
			
			PageFactory.initElements(driver, this);
		}
	 
	 public void insideHotelBookingsPage() throws InterruptedException {
		 
		 Thread.sleep(3000);
		 hotelsbtn.click();
		 city.sendKeys(prop.getProperty("HotelLocation"));
		 Thread.sleep(3000);
		 select_city.click();
		 guests_dropdown.click();
		 guests_count.isDisplayed();
		 By mySelector=By.xpath("//div[contains(@class,'widgetSection appendBottom40')]//ul[1]");
		  
			List<WebElement> myElements = driver.findElements(mySelector);
			{
			  
			  for(WebElement ele:myElements)
			  {
				  System.out.println(ele.getText());
			  }
		 
		 
	 }

}
}
