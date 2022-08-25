package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	By pageTitle = By.xpath("//h1[@class='page-heading']");
	
		public AccountCreationPage() {
			PageFactory.initElements(driver, this);
		}
		public boolean validateAccountCreatePage() {
			return driver.findElement(pageTitle).isDisplayed();
		}
}
