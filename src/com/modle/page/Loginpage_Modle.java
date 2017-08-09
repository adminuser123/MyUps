package com.modle.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage_Modle  extends HomePage_BaseClass{
	
	public Loginpage_Modle(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected WebElement loginLink = null;
	protected WebElement UserId = null;
	protected WebElement PassWord = null;
	protected WebElement loginSubmit = null;
	protected WebElement logOut = null;
	
	
	public WebElement loginLink(){
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
		return login;
	}
	public WebElement UserId(){
		WebElement id = driver.findElement(By.xpath(".//*[@id='email']"));
		return id;
	}
	public WebElement Password(){
		WebElement pass = driver.findElement(By.xpath(".//*[@id='email']"));
		return pass;
	}
	public WebElement loginSubmit(){
		WebElement submit = driver.findElement(By.xpath(".//*[@id='submitBtn']"));
		return submit;
	}
	public WebElement logOut(){
		WebElement out = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		return out;
	}


}
