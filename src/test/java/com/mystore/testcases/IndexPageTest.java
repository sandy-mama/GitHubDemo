package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indxpg;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void verifylogo() {
		 indxpg = new IndexPage();
		 boolean LogoResult = indxpg.validateLogo();
		 Assert.assertTrue(LogoResult);
	}
	
	@Test
	public void verifyTitle() {
		indxpg = new IndexPage();
		String Act_Title_Text = indxpg.getMystoretitle();
		String Exp_text = "My Store";
		Assert.assertEquals(Act_Title_Text, Exp_text);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}			
}