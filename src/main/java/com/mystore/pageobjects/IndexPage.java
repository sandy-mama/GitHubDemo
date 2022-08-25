package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{
	
	By signin_btn =	By.xpath("//a[@class='login']");
	By myLogo = By.xpath("//img[@class='logo img-responsive']");
	By search_prod_box = By.name("search_query");
	By search_submit_btn = By.name("submit_search");
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage ClickOnSignIn() {
		driver.findElement(signin_btn).click();
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		return driver.findElement(myLogo).isDisplayed();
	}
	
	public String getMystoretitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle; 
	} 
	
	public searchResultPage searchProduct(String productname) {
		driver.findElement(search_prod_box).clear();
		driver.findElement(search_prod_box).sendKeys(productname);
		driver.findElement(search_submit_btn).click();
		return new searchResultPage();
	}
}