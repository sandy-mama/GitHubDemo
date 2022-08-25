package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {

	
	By My_wishlist_btn = By.xpath("//*[@title='My wishlists']");
	By Order_history_details = By.xpath("//*[@title='Orders']");
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatemywishlist() {
		return driver.findElement(My_wishlist_btn).isDisplayed();
	}
	
	public boolean validateOrderHistory() {
		return driver.findElement(Order_history_details).isDisplayed();
	}
	
	public String getCurrUrl() {
		String homepageUrl = driver.getCurrentUrl();
		return homepageUrl;
	}
	
}
