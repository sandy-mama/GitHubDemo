package com.mystore.testcases;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.utilities.ScreenShotTest;

public class AccountCreationPageTest extends BaseClass {
		IndexPage indxpg; 
		LoginPage lognpg;
		AccountCreationPage acccreationpg;
		
		@BeforeMethod
		public void setup() throws InterruptedException {
			launchApp();
		}	

		@Test
		public void createAccountTest() {
			indxpg = new IndexPage();
			lognpg =indxpg.ClickOnSignIn();
			ScreenShotTest.takeScreenShot();
			acccreationpg=lognpg.createNewAccount("JamesssBonddd007@gmail.com");
			boolean result_Acc_Creation = acccreationpg.validateAccountCreatePage();
			Assert.assertTrue(result_Acc_Creation);
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}
}