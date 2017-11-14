package main.java.genericLib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class WebdriverCommonLib {

	

		 static void waitForPageToLoad(){
			Baseclass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void waitForElemetPresent(WebElement wb){
			WebDriverWait wait = new WebDriverWait(Baseclass.driver, 20);
			wait.until(ExpectedConditions.visibilityOf(wb));
		}
		
		public void select(WebElement selwb, String data){
			Select sel = new Select(selwb);
			sel.selectByVisibleText(data);
		}

		public void select(WebElement selwb, int index){
			Select sel = new Select(selwb);
			sel.selectByIndex(index);
		}
	}
  
