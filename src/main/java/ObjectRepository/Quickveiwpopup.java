
	
	package main.java.ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class  Quickveiwpopup  {
		private WebDriver driver;
		
		@FindBy(xpath="//div[@class='col-xs-12 col-sm-4 widgets-box']//img[@class='img-responsive' and @suits='']")
		private WebElement Product;	
		
		@FindBy(xpath="//a[text='Quick View']")
		private WebElement Quickveiw;	
			
		


		//Initializing all the elements
		public void Searchpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		

	public void prdt()
	{
		Product.click();
		
	}

	

	public void quickveiw()
	{
		Quickveiw.click();
		
	}
	
	}


