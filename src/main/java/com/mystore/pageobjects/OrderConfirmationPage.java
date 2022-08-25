package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;

	public class OrderConfirmationPage extends BaseClass{
		
		Actions action =new Actions(driver);
		
		By ordrComptionText = By.xpath("//*[@id=\"center_column\"]/div/p/strong");
		String exp_text =  "Your order on My Store is complete.";
		
		public OrderConfirmationPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String validateOrderCompletionText() {
			String confMsg = driver.findElement(ordrComptionText).getText();
			return confMsg;
	}
}