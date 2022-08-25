package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.searchResultPage;

public class SearchResultPageTest extends BaseClass {
	IndexPage indxpg;
	searchResultPage srchResltpg;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void ProductAvailabilityCheck() {
		indxpg = new IndexPage();
		srchResltpg = indxpg.searchProduct("T-Shirt");
		boolean result = srchResltpg.isproductavailable();
		Assert.assertTrue(result);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}