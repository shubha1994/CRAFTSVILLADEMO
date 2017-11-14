	
	package main.java.ObjectRepository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Smallimages     {
		private WebDriver driver;
		
		@FindBy(className="product-image")
		private WebElement Product;	
		
		@FindBy(xpath="//a[text='Quick View']")
		private WebElement Quickveiw;	
		

		@FindBy(className="lazy")
		private WebElement smallimage;
		
		
			
		


		//Initializing all the elements
		public void Searchpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		

	public void prdt()
	{
		Product.click();
		
	}

	

	public void qveiw()
	{
		Quickveiw.click();
		
	}


	public void smimage()
	{
		 smallimage	.click();
		
	}
	
	


}


