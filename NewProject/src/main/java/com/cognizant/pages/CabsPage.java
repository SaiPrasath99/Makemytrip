package com.cognizant.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.base.TestBase;

public class CabsPage extends TestBase{
	
	
	@FindBy(xpath="//li[contains(@class,'menu_Cabs')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement CabsButton;
	
	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement from_city;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]")
	WebElement from_city_name;
	
	@FindBy(xpath = "//input[@id='toCity']")
	WebElement to_city;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]/span[1]")
	WebElement to_city_name;
	
	@FindBy(xpath = "//span[contains(text(),'DEPARTURE')]")
	WebElement departure_date_dropdown;
	
	@FindBy(xpath = "//div[contains(@class,'DayPicker-Months')]//div[2]//div[3]//div[5]//div[5]")
	WebElement select_date;
	
	@FindBy(xpath = "//span[contains(text(),'PICKUP-TIME')]")
	WebElement pickup_time;
	
	@FindBy(xpath = "//div[contains(@class,'minContainer')]//li[14]")
	WebElement select_time;
	
	@FindBy(xpath = "//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")
	WebElement searchbtn;
	
	@FindBy(xpath = "//p[@class='font32 latoBold appendBottom10']")
	WebElement cabs_message;
	
	@FindBy(xpath="//body/div[@id='root']/div/div[@class='cabPage']/div[@class='container']/div[@class='makeFlex']/div[@class='cabListingLeftWraper']/ul/li[3]")
	WebElement CabsDisplay;
	
    public CabsPage() {
		
		PageFactory.initElements(driver, this);
	}
    
    
    public void insideCabsPage() throws InterruptedException {
//    	try{   
//			   driver.switchTo().alert().dismiss();  
//			  }catch(Exception e){ 
//			   System.out.println("unexpected alert not present");   
//			  }
    	Thread.sleep(3000);
    	CabsButton.click();
		from_city.sendKeys(prop.getProperty("CabsFromcity"));
		Thread.sleep(3000);
		from_city_name.click();
		Thread.sleep(3000);
		to_city.sendKeys("Manali");
		Thread.sleep(3000);
		departure_date_dropdown.click();
		Thread.sleep(3000);
		select_date.click();
		pickup_time.click();
		select_time.click();
		searchbtn.click();
		if(cabs_message.isDisplayed())
		{
			String Cab=cabs_message.getText();
			System.out.println(Cab);
		}
		else
		{
			//Initialise the javascript driver
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  
			  //Find element by link text and store in variable "Element"        		
			  CabsDisplay.isDisplayed();

		      //This will scroll the page till the element is found		
		      js.executeScript("arguments[0].scrollIntoView()", CabsDisplay);
		      
		      //Find SUV price
		      String SUVprice =CabsDisplay.getText().toString().substring(2,7).replace("\""," ").replace(","," ");
				
		      System.out.println(SUVprice);
		}
    }
    
    
    
    
	
	
	

}
