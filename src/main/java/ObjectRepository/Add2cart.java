
	
	package main.java.ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class  Add2cart  {
		private WebDriver driver;
		
		@FindBy(className="product-image")
		private WebElement Product;	
		

		@FindBy(id="addtocart")
		private WebElement Cart;
		




		//Initializing all the elements
		public void Searchpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		

	public void prdt()
	{
		Product.click();
		
	}

	

	public void crt()
	{
		Cart.click();
		
	}
	
	}


