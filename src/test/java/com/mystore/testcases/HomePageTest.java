package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	IndexPage indxpg;
	LoginPage lognpg;
	HomePage hompg;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void verifyWishList() {
		indxpg = new IndexPage();
		lognpg =indxpg.ClickOnSignIn();
		hompg = lognpg.Login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result_WishList= hompg.validatemywishlist();
		Assert.assertTrue(result_WishList);
	}
	
	@Test
	public void verifyHistory() {
		indxpg = new IndexPage();
		lognpg =indxpg.ClickOnSignIn();
		hompg = lognpg.Login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result_history = hompg.validateOrderHistory();
		Assert.assertTrue(result_history);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}