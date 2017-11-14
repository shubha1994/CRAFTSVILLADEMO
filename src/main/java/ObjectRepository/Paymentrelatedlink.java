
	


	package main.java.ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Paymentrelatedlink  {
		private WebDriver driver;
		
		@FindBy(className="product-image")
		private WebElement Product;	
		
		  
		
		@FindBy(className="icon cv-customer-review")
		private WebElement contacts;
		
		
		@FindBy(linkText="Payment Related")
		private WebElement PaymentRelated;

		


		//Initializing all the elements
		public void Searchpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		

	public void prdt()
	{
		Product.click();
		
	}

	

	public void cntct()
	{
		contacts.click();
		
	}
	

	public void lktest ()
	{
		 PaymentRelated.click();
		
	}



}




