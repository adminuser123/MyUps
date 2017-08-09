package com.controller.page;

import org.openqa.selenium.WebDriver;

import com.modle.page.Loginpage_Modle;

public class LoginPage_controller extends Controller_BaseClass{

	protected Loginpage_Modle loginPage = null;
	public LoginPage_controller(WebDriver driver) {
		super(driver);
		loginPage = new Loginpage_Modle(driver);			
				
	}
	public void login(String id, String pass){
		loginPage.loginLink().click();
		loginPage.UserId().sendKeys(id);
		loginPage.Password().sendKeys(pass);
		loginPage.loginSubmit().click();
	}
	
	public void logOut(){
		loginPage.logOut().click();
	}

}
