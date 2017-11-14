package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutocompleteTest {



	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.findElement(By.id("lst-ib")).sendKeys("wipro c");
		
			

	}

}
