package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class OrderSummaryPage extends BaseClass{
		
	By Ordr_conf_btn = By.xpath("//*[@class='button btn btn-default button-medium']");
	
	public OrderSummaryPage () {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickOnOrderConfirmation() {
		driver.findElement(Ordr_conf_btn).click();
		return new OrderConfirmationPage();
	}

}
