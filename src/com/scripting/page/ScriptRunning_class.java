package com.scripting.page;

import org.testng.annotations.Test;

import com.main.driverBase.BaseDriverClass;

public class ScriptRunning_class extends BaseDriverClass{

	
	//@Test
	public void cteatShipment(){
		creatshipment().login("sabinaus04", "Ratri2002");
		creatshipment().creatShipmentPage();
		creatshipment().ShipmentGoingTo();
		creatshipment().shippingItem();
		creatshipment().paymentMethod("12345678", "11418");
		
	}
	//@Test
	public void creatReturn(){
		creatshipment().login("sabinaus04", "Ratri2002");
		creatshipment().creatReturnPage();
		creatshipment().ShipmentGoingTo();
		creatshipment().creatReturn();
		creatshipment().paymentMethod("12345678", "11418");
		
		
		
	}
	@Test
	public void userLogin(){
		loginTest().login("sabinaus04", "Ratri2002");
		
		loginTest().logOut();
		
	}
	
}
