
	package test.java;

	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

import main.java.genericLib.Baseclass;
import main.java.genericLib.Excellib;
import main.java.ObjectRepository.*;

	public class cratsvillaTest extends Baseclass {

	    Excellib lib = new Excellib();
	   
	    @Test
	    public void createBrandTest()
	    {
	        Homepage home= PageFactory.initElements(driver, Homepage.class);
	       
	    }
	}

