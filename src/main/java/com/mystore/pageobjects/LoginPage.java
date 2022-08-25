package com.mystore.pageobjects;

import org.openqa.selenium.By;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	
		By Reg_Email_box = By.name("email");
		By Reg_Password_Box = By.name("passwd");
		By Login_btn = By.name("SubmitLogin");
		By new_email_box = By.id("email_create");
		By create_Account_btn = By.id("SubmitCreate");

		public HomePage Login (String usr_name, String password) {
			driver.findElement(Reg_Email_box).sendKeys(usr_name);
			driver.findElement(Reg_Password_Box).sendKeys(password);
			driver.findElement(Login_btn).click();
			return new HomePage();
		}
		
		public AddressPage Login2Checkout (String usr_name, String password) {
			driver.findElement(Reg_Email_box).sendKeys(usr_name);
			driver.findElement(Reg_Password_Box).sendKeys(password);
			driver.findElement(Login_btn).click();
			return new AddressPage();
		}
		
		public AccountCreationPage createNewAccount(String NewEmail) {
			driver.findElement(new_email_box).sendKeys(NewEmail);
			driver.findElement(create_Account_btn).click();
			return new AccountCreationPage();
		}		
}