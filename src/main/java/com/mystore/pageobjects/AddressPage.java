package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {

	By ProceedTocheckout3 = By.name("processAddress");
	
	 public AddressPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	public ShippingPage clickOnProceedToCheckOut() {
		driver.findElement(ProceedTocheckout3).click();
		return new ShippingPage();
	}
	
}
