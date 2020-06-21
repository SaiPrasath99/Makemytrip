package com.cognizant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.base.TestBase;

public class Loginpage extends TestBase{
	
	
	//PageFactory
	
	@FindBy(xpath = "webklipper-publisher-widget-container-notification-close-div")
	WebElement closepopup;
	
	@FindBy(xpath = "//p[contains(text(),'Login or Create Account')]")
	WebElement loginbtn;
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement continuebtn;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='capText font16']//span[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//div[@id='SW']//div[@class='landingContainer']")
	WebElement unnecessary_click;
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void login(String uname, String pwd) throws InterruptedException{
		try {
			driver.switchTo().alert().dismiss();
		}catch(Exception e) {
			System.out.println("unexpected alert not present");
		}
		//closepopup.click();
		unnecessary_click.click();
		Thread.sleep(3000);
		loginbtn.click();
		username.sendKeys(uname);
		continuebtn.click();
		password.sendKeys(pwd);
		login.click();	
		
	}

}
