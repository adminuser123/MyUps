package com.main.driverBase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.controller.page.CreatShipment_controller;
import com.controller.page.LoginPage_controller;

public class BaseDriverClass {
	WebDriver driver;
	String url= "https://www.ups.com/us/en/Home.page";
	
	@Parameters("my browser")
	@BeforeMethod
	public void beforeMethod(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
		driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver","C:\\usr\\development\\req_sw\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver","C:\\usr\\development\\req_sw\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		
	}
	

@Test
public void test1(){
	System.out.println("abc");
}
@AfterMethod
public void afterMethod(){
	driver.quit();
	
}
public CreatShipment_controller creatshipment(){
	return new CreatShipment_controller(driver);
}
public LoginPage_controller loginTest(){
	return new LoginPage_controller(driver);
}
}
