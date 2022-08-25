package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddtoToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.searchResultPage;

	public class AddToCartPageTest extends BaseClass{
		IndexPage indxpg;
		searchResultPage srchResltpg;
		AddtoToCartPage addToCartpg;
		
		@BeforeMethod
		public void setup() throws InterruptedException {
			launchApp();
		}
		
		@Test
		public void addToCartTest() throws InterruptedException {
			indxpg= new IndexPage();
			srchResltpg = indxpg.searchProduct("T-shirt");
			addToCartpg = srchResltpg.ClickOnProduct();
			addToCartpg.EnterQuantity("2");
			Thread.sleep(2000);
		//	addToCartpg.SelectSize();   // Don't run this method until SelectByIndex is sorted
			Thread.sleep(2000);
			addToCartpg.clickonAddtoCart();
			boolean result = addToCartpg.validate_addedtoCartorNot();
			Assert.assertTrue(result);
		}	
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}
}