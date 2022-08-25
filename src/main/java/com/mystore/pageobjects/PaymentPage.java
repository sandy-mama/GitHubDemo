package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class PaymentPage extends BaseClass{
	
	By Bank_Trnsfr_btn = By.xpath("//p/a[@title='Pay by bank wire']");
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderSummaryPage clickOnBankTransfer() {
		driver.findElement(Bank_Trnsfr_btn).click();
		return new OrderSummaryPage();
	}
}