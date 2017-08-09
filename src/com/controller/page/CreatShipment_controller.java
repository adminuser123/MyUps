package com.controller.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.modle.page.CreatShipment_Modle;
import com.modle.page.Loginpage_Modle;

public class CreatShipment_controller extends Controller_BaseClass {
	protected CreatShipment_Modle shipment = null;
	protected Loginpage_Modle loginPage = null;

	public CreatShipment_controller(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		shipment = new CreatShipment_Modle(driver);
		loginPage = new Loginpage_Modle(driver);
	}

	public void login(String userid, String pass) {
		loginPage.loginLink().click();
		loginPage.UserId().sendKeys(userid);
		loginPage.Password().sendKeys(pass);
		loginPage.loginSubmit().click();

	}

	public void creatShipmentPage() {
		Actions hoverAction = new Actions(driver);
		hoverAction.moveToElement(shipment.Shipping());
		hoverAction.perform();
		shipment.CreatShipping().click();
	}
	public void creatReturnPage(){
		Actions hoverAction = new Actions(driver);
		hoverAction.moveToElement(shipment.Shipping());
		hoverAction.perform();
		shipment.returnShipment().click();
		
	}

	public void ShipmentGoingTo() {
		Select am = new Select(shipment.addressbook());
		am.selectByIndex(1);
		Select s = new Select(shipment.saveOption());
		s.selectByVisibleText("Save as New Entry");
	}

	public void shippingItem() {
		Select select = new Select(shipment.NumberofPackages());
		select.selectByVisibleText("1");
		Select ab = new Select(shipment.packagingType());
		ab.selectByVisibleText("UPS Letter");
		shipment.packageValue().sendKeys("500");
		shipment.radioNo().click();
		Select ob = new Select(shipment.service());
		ob.selectByVisibleText("UPS Ground Service");
	}

	public void paymentMethod(String UPSAcc, String pzip) {
		Select ob1 = new Select(shipment.paymentMethod());
		ob1.selectByVisibleText("Enter a Shipping Account");
		shipment.UPSAccountNumber().sendKeys(UPSAcc);
		shipment.UpsAccName().sendKeys(pzip);
		Select s1 = new Select(shipment.saveOption());
		s1.selectByVisibleText("Save as New Entry");
		shipment.next().click();
	}
	public void creatReturn(){
		Select ab = new Select(shipment.packagingType());
		ab.selectByVisibleText("UPS Letter");
		shipment.packageValue().sendKeys("500");
		shipment.MarchDescription().sendKeys("Letter");
		Select ob = new Select(shipment.service());
		Select obv = new Select (shipment.lavelDalivary());
		obv.selectByVisibleText("Print Return Lavel");
		ob.selectByVisibleText("UPS Ground Service");
		
	}

}