package com.mystore.testcases;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.utilities.ScreenShotTest;

	
public class LoginPageTest extends BaseClass{
	static Logger sandy = LogManager.getLogger(LoginPageTest.class.getName());
	
	IndexPage indxpg;
	LoginPage lognpg;
	HomePage hompg;
	ScreenShotTest scrnshot;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void loginTest() {
		indxpg = new IndexPage();
		sandy.error("GIT Code Changed a bit and trying to check in this line");
		lognpg =indxpg.ClickOnSignIn();
		sandy.error("UserId and Password entered");
		hompg = lognpg.Login(prop.getProperty("username"), prop.getProperty("password"));
		sandy.error("Automationpractice.com url entered");
		String act_url = hompg.getCurrUrl();
		String exp_url = "http://automationpractice.com/index.php?controller=my-account";
		sandy.error("test case nearly passed now ");
		Assert.assertEquals(act_url, exp_url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}