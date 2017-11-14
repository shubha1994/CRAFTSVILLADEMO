package main.java.genericLib;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import main.java.ObjectRepository.*;

	

	public class Baseclass {
		public static WebDriver driver;
		public static String username;
		@BeforeClass
		public void configBc()
		{
			 //launch Browser
			if(Constants.browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(Constants.browser.equalsIgnoreCase("ie"))
			{
			System.setProperty("webdriver.ie.driver", "./resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
			else{
				System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.get(Constants.url);
		}
		
		@BeforeMethod
		public void configBm() throws Throwable{
			//step 1 :login to APP
		     Login loginPage = PageFactory.initElements(driver, Login.class);
		    // username= Excellib.getExcelData("Sheet1", 1, 0);
		     
		     loginPage.loginToAPP(Constants.username, Constants.password);
		}
		@AfterMethod
		public void configAm(){
		 Comm cPage = PageFactory.initElements(driver, Comm.class);
		 cPage.logout(driver);
		}
	  
		
		@AfterClass
		public void configAc(){
			driver.close();
		}
	
	  
}
