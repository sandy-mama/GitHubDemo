package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.base.BaseClass;

public class AddtoToCartPage extends BaseClass{
	
	By qnty_field = By.id("quantity_wanted");
	WebElement size_field = driver.findElement(By.name("group_1"));
	By addtoCart_btn = By.xpath("//*[@id='add_to_cart']");
	By tick_sign = By.xpath("//h2/i[@class='icon-ok']");
	By proceed_ckout_btn = By.xpath("//span[contains(text(), 'Proceed to checkout')]");
	
	public AddtoToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterQuantity(String qnty) {
		driver.findElement(qnty_field).clear();
		driver.findElement(qnty_field).sendKeys(qnty);
	}
	
	public void SelectSize() {
		Select objSelect = new Select(size_field);
		objSelect.selectByValue("M");
		
	}
	
	public void clickonAddtoCart() throws InterruptedException {
		driver.findElement(addtoCart_btn).click();
		Thread.sleep(10000); // Learn how to add ****fluentwait***
	}
	
	public boolean validate_addedtoCartorNot() throws InterruptedException {
			return driver.findElement(tick_sign).isDisplayed();
		
	}
	
	public OrderPage checkout() {
		driver.findElement(proceed_ckout_btn).click();
		return new OrderPage();
	}
}