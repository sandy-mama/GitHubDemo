package com.mystore.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

	public class ShippingPage extends BaseClass{
			
		By checkbox_Tick = By.id("uniform-cgv");
		By ProceedToChekout3 = By.name("processCarrier");
		
		public ShippingPage() {
			PageFactory.initElements(driver, this);
		}
		
		public PaymentPage TickTermsAndCheckOut() {
			driver.findElement(checkbox_Tick).click();
			driver.findElement(ProceedToChekout3).click();
			return new PaymentPage();
		}

}
