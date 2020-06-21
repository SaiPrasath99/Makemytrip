package com.cognizant.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("browser", "Chrome");
		dcap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(dcap);
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.28:4444/wd/hub"),options);
		
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		
		}

}
