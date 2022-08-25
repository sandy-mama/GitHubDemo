package com.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.mystore.base.BaseClass;

public class ScreenShotTest extends BaseClass{
	
	public static void takeScreenShot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File ("C:\\Users\\IT POINT\\eclipse-workspace\\MyStoreProject\\Screenshot\\Screenshot1.png"));
			} catch (IOException e) {
				e.printStackTrace();
		}		
	}
}