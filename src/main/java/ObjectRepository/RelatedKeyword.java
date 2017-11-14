package main.java.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelatedKeyword {
	private WebDriver driver;
	
	@FindBy(id="searchval")
	private WebElement Search;	




	//Initializing all the elements
	public void Searchpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

public void srch(String s)
{
	Search.sendKeys(s);
	
}

}
