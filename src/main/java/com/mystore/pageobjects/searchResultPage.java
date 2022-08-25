package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class searchResultPage extends BaseClass {

	By product_result = By.xpath("//a[@class='product_img_link']");

	public searchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isproductavailable() {
		return driver.findElement(product_result).isDisplayed();
	}

	public AddtoToCartPage ClickOnProduct() {
		driver.findElement(product_result).click();
		return new AddtoToCartPage();
	}
}
