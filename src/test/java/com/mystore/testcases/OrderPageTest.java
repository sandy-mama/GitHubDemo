package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddtoToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.searchResultPage;

public class OrderPageTest extends BaseClass {
	IndexPage indxpg;
	searchResultPage srchResltpg;
	AddtoToCartPage addToCartpg;
	OrderPage ordrpg;
	LoginPage lognpg;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void verifyTotalPrice() throws InterruptedException {
		indxpg= new IndexPage();
		srchResltpg = indxpg.searchProduct("T-shirt");
		addToCartpg = srchResltpg.ClickOnProduct();
		addToCartpg.EnterQuantity("2");
		addToCartpg.clickonAddtoCart();
		ordrpg = addToCartpg.checkout();
		double act_total= ordrpg.convertTotal();
		double exp_total = ordrpg.calculatedTotal();
		Assert.assertEquals(exp_total, act_total);
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}