package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass{
	
	By unit_price = By.xpath("//td[@class='cart_unit']/span/span");
	By totals = By.id("total_price");
	By ProceedtoCheckOut2 = By.xpath("//a[@title='Proceed to checkout']//span[text()='Proceed to checkout']");
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
		String unit_Price1 = driver.findElement(unit_price).getText();
		String unit_price2 = unit_Price1.replace("$", "");
		double finalUnitPrice = Double.parseDouble(unit_price2);
		return finalUnitPrice;
	}
	
	public double convertTotal() {
		String total1 = driver.findElement(totals).getText();
		String total2 = total1.replace("$", "");
		double actualTotal = Double.parseDouble(total2);
		return actualTotal;
	}
	
	public LoginPage clickOnCheckOut() throws InterruptedException {
		driver.findElement(ProceedtoCheckOut2).click();
		return new LoginPage();
	}
	
	public double calculatedTotal() {
		double expectedTotal = (getUnitPrice()*2)+2;
		return expectedTotal; 
	}
}