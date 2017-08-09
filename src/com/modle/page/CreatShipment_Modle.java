package com.modle.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreatShipment_Modle extends HomePage_BaseClass{
	
	
		
	
	public CreatShipment_Modle(WebDriver driver) {
		super(driver);
		
	}
	
	protected WebElement Shipping = null;
	protected WebElement CreatShipment = null;
	protected WebElement ReceiverName = null;
	protected WebElement Receivercity = null;
	protected WebElement ReceiverContact = null;
	protected WebElement ReceiverCountry = null;
	protected WebElement ReceiverEmail = null;
	protected WebElement ReceiverZip = null;
	protected WebElement ReceiverState = null;
	protected WebElement ReceiverAddress = null;
	protected WebElement SenderName = null;
	protected WebElement SenderCity = null;
	protected WebElement SenderContact = null;
	protected WebElement SenderEmail = null;
	protected WebElement SenderZipCode = null;
	protected WebElement SenderState = null;
	protected WebElement SenderAddress = null;
	protected WebElement Senderountry= null;
	protected WebElement ReturnAddress = null;
	protected WebElement Residentialaddress = null;
	protected WebElement SenderTelephone = null;
	protected WebElement ValidateAddress = null;
	protected WebElement ReceiverResidentialaddress= null;
	protected WebElement NumberofPackages = null;
	protected WebElement loginButton = null;
	protected WebElement continueApp = null;
	protected WebElement addressbook = null;
	protected WebElement saveOption = null;
	protected WebElement returnAdd = null;
	protected WebElement packagingType =null;
	protected WebElement service =null;
	protected WebElement UPSAccountNumber = null;
	protected WebElement next = null;
	protected WebElement UpsAccName = null;
	protected WebElement returnShipment = null;
	protected WebElement lavelDalivary = null;
	protected WebElement MarchDescription = null;
	
	
	public  WebElement lavelDalivary(){
		WebElement lavel = driver.findElement(By.xpath(".//*[@id='returnService']"));
		return lavel;
	}
	public  WebElement returnShipment(){
		WebElement returnship = driver.findElement(By.xpath(".//*[@id='ups-menuPanel1']/div[1]/div[1]/ul/li[5]/a"));
		return returnship;
	}
	
	
	
	public  WebElement Shipping(){
		WebElement ship = driver.findElement(By.xpath(".//*[@id='navImg1']"));
		return ship;
		
	}
	public  WebElement CreatShipping(){
		WebElement creatship = driver.findElement(By.xpath(".//*[@id='ccpnmenu1']/a[1]"));
		return creatship;
		
	}
	public  WebElement continueApp(){
		WebElement app= driver.findElement(By.xpath(".//*[@id='ContinueToApplication']"));
		return app;
		
	}
	public  WebElement addressbook(){
		WebElement addbook= driver.findElement(By.xpath(".//*[@id='select_shipTo']"));
		return addbook;
		
	}
	public  WebElement ReceiverName(){
		WebElement name= driver.findElement(By.xpath(".//*[@id='shipToNameValue']"));
		return name;
		
	}
	public  WebElement MarchDescription(){
		WebElement description= driver.findElement(By.xpath(".//*[@id='packageBean_merchandiseDescription']"));
		return description;
		
	}
	public  WebElement Receivercity(){
		WebElement city= driver.findElement(By.xpath(".//*[@id='shipToCityValue']"));
		return city;
		
	}
	public  WebElement ReceiverContact(){
		WebElement contact= driver.findElement(By.xpath(".//*[@id='shipToContactNameValue']"));
		return contact;
		
	}
	public  WebElement ReceiverCountry(){
		WebElement country= driver.findElement(By.xpath(".//*[@id='shipToCountryValue']"));
		return country;
		
	}
	public  WebElement ReceiverState(){
		WebElement state= driver.findElement(By.xpath(".//*[@id='shipToStateValue']"));
		return state;
	}
	public  WebElement ReceiverEmail(){
		WebElement email= driver.findElement(By.xpath(".//*[@id='shipToEmailValue']"));
		return email;
		
	}
	public  WebElement ReceiverAddress(){
		WebElement add= driver.findElement(By.xpath(".//*[@id='shipToStreetValue']"));
		return add;
	}
	public  WebElement ReceiverZip(){
		WebElement zip= driver.findElement(By.xpath(".//*[@id='shipToPostalValue']"));
		return zip;
		
	}
	public  WebElement ValidateAddress(){
		WebElement validate= driver.findElement(By.xpath(".//*[@id='shipToValidate']"));
		return validate;
		
	}
	public  WebElement ReceiverResidentialaddress(){
		WebElement residential= driver.findElement(By.xpath(".//*[@id='shipToResidential']"));
		return residential;
		
	}
	public  WebElement saveOption(){
		WebElement save= driver.findElement(By.xpath(".//*[@id='shipToSaveOption']"));
		return save;
		
	}
	public  WebElement returnAdd(){
		WebElement add= driver.findElement(By.xpath(".//*[@id='shipperSameAsShipFrom']"));
		return add;
		
	}
	public  WebElement NumberofPackages(){
		WebElement pac= driver.findElement(By.xpath(".//*[@id='packageCount']"));
		return pac;
		
	}
	public  WebElement packagingType(){
		WebElement type= driver.findElement(By.xpath(".//*[@id='packagingType']"));
		return type;
		
	}
	public  WebElement packageValue(){
		WebElement value= driver.findElement(By.xpath(".//*[@id='packageBean_insuredAmount']"));
		return value;
		
	}
	public  WebElement radioNo(){
		WebElement button= driver.findElement(By.xpath(".//*[@id='includesBatteriesNo']"));
		return button;
		
	}
	public  WebElement service(){
		WebElement service= driver.findElement(By.xpath(".//*[@id='service']"));
		return service;
		
	}
	public  WebElement paymentMethod(){
		WebElement payment= driver.findElement(By.xpath(".//*[@id='payerOfTransportation']"));
		return payment;
	}
	public  WebElement paymentZip(){
		WebElement zip = driver.findElement(By.xpath(".//*[@id='transportationPayerShipperAccountPostalCode']"));
		return zip;
	}
	public  WebElement UPSAccountNumber (){
		WebElement account= driver.findElement(By.xpath(".//*[@id='transportationPayerShipperAccountNumber']"));
		return account;
	}
	public  WebElement next(){
		WebElement next= driver.findElement(By.xpath(".//*[@id='next']"));
		return next;
	}
	public  WebElement UpsAccName(){
		WebElement name= driver.findElement(By.xpath(".//*[@id='transportationPayerShipperAccountDescription']"));
		return name;
	}
}
