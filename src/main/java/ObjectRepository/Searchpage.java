package main.java.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
private WebDriver driver;

@FindBy(id="cv-logo")
   private WebElement logo;	

@FindBy(linkText="KURTIS & MORE" )
private  WebElement BrandKURTIS;



@FindBy(linkText="Sutva Lehengas")
private   WebElement sutvalehnga;





@FindBy(linkText="ACCESSORIES " )
private  WebElement Accessories ;



@FindBy(linkText=" SAREES " )
private  WebElement Sarees ;


@FindBy(linkText="SALWAR SUITS " )
private WebElement Salwarsuits ;



@FindBy(className ="hidden-xs" )
private WebElement  cart ;



@FindBy( className="hidden-xs user-name")
private WebElement signup;

//Initializing all the elements
public void Searchpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public void Brandkurthis()
{
	BrandKURTIS.click();
	
}



public void sutavalengha()
{
	sutvalehnga	.click();
	
}



public void Accessories()
{
	Accessories	.click();
	
}



public void Sarees()
{
	Sarees.click();
	
}


public void Salwarsuits()
{
	Salwarsuits.click();
	
}




public void Cart()
{
	 cart.click();
	
}


public void signup()
{
	signup.click();
	
}


}







