package main.java.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage {




public class HomePage {

    @FindBy(linkText="CRAFTSVILLA BRANDS")
  private  WebElement Brands;
   
    @FindBy(linkText="Sutva Lehengas")
 private   WebElement sutva_Lehnga;
   
    public void navigateToSutvaLehngaPage(WebDriver driver)
    {
        Actions act= new Actions(driver);
        act.moveToElement(Brands);
        sutva_Lehnga.click();
    }
}
}
