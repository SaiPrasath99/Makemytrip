package com.cognizant.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.base.TestBase;

public class GiftcardsPage extends TestBase{
	
	@FindBy(xpath = "//li[contains(@class,'menu_Giftcards')]//a[contains(@class,'makeFlex hrtlCenter column')]")
	WebElement giftcardsbtn;
	
	@FindBy(xpath = "//li[@class='noPadding']//a[contains(text(),'Group Gifting')]")
	WebElement group_gifting_btn;
	
	@FindBy(xpath = "//a[contains(text(),\"+ Mother's Day\")]")
	WebElement click_mothersday;
	
	@FindBy(xpath = "//input[@id='amount']")
	WebElement giftcard_amount;
	
	@FindBy(xpath = "//input[@id='deadline']")
	WebElement date_dropdown;
	
	@FindBy(xpath = "//td[contains(text(),'30')]")
	WebElement select_expiry_date;
	
	@FindBy(xpath = "//div[@id='form1']//div[@class='col-sm-12 col-md-12 col-lg-12']//input[1]")
	WebElement click_terms_and_conditions;
	
	@FindBy(xpath = "//button[@id='next1']")
	WebElement click_next1;
	
	@FindBy(xpath = "//input[@id='recipient']")
	WebElement recipient_name;
	
	@FindBy(xpath = "//input[@id='recipientemail']")
	WebElement recipient_mail;
	
	@FindBy(xpath = "//button[@id='next2']")
	WebElement click_next2;
	
	@FindBy(xpath = "//div[@id='flash-message']")
	WebElement alert_message;
	
	@FindBy(xpath = "//div[@id='okay']")
	WebElement accept_alert;
	
    public GiftcardsPage() {
		
		PageFactory.initElements(driver, this);
	}
    
    public void insideGiftcardsPage() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	giftcardsbtn.click();
    	Thread.sleep(3000);
    	group_gifting_btn.click();
    	Thread.sleep(3000);
    	click_mothersday.click();
    	Thread.sleep(3000);
    	giftcard_amount.sendKeys(prop.getProperty("GiftCardAmount"));
    	date_dropdown.click();
    	select_expiry_date.click();
    	click_terms_and_conditions.click();
    	
    	WebElement Element = click_next1;
    	click_next1.isDisplayed();
    	Thread.sleep(3000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", click_next1);
    	
    	click_next1.click();
    	recipient_name.sendKeys(prop.getProperty("Recipient_name"));
    	recipient_mail.sendKeys(prop.getProperty("Recipient_mail"));
    	click_next2.click();
    	
    	System.out.println(alert_message.getText());
    	
    }
	

}
