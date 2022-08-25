package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddressPage;
import com.mystore.pageobjects.AddtoToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderConfirmationPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.OrderSummaryPage;
import com.mystore.pageobjects.PaymentPage;
import com.mystore.pageobjects.ShippingPage;
import com.mystore.pageobjects.searchResultPage;

public class EndToEndTest extends BaseClass{
	IndexPage indxpg;
	searchResultPage srchResltpg;
	AddtoToCartPage addToCartpg;
	OrderPage ordrpg;
	LoginPage lognpg;
	AddressPage addrsspg;
	ShippingPage shipngpg;
	PaymentPage paymntpg;
	OrderSummaryPage ordrsummrypg;
	OrderConfirmationPage ordrconfpg;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void EndtoEndTest() throws InterruptedException {
		indxpg= new IndexPage();
		srchResltpg = indxpg.searchProduct("T-shirt");
		addToCartpg = srchResltpg.ClickOnProduct();
		addToCartpg.EnterQuantity("2");
		addToCartpg.clickonAddtoCart();
		ordrpg = addToCartpg.checkout();
		lognpg = ordrpg.clickOnCheckOut();
		addrsspg = lognpg.Login2Checkout(prop.getProperty("username"), prop.getProperty("password"));
		shipngpg = addrsspg.clickOnProceedToCheckOut();
		paymntpg = shipngpg.TickTermsAndCheckOut();
		ordrsummrypg = paymntpg.clickOnBankTransfer();
		ordrconfpg=ordrsummrypg.clickOnOrderConfirmation();
		String act_msg = ordrconfpg.validateOrderCompletionText();
		String exp_msg = "Your order on My Store is complete.";
		Assert.assertEquals(act_msg, exp_msg);
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
