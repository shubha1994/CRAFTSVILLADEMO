



package test.java;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import main.java.genericLib.*;



import main.java.ObjectRepository.*;


public class RelatedkeywordTest extends Baseclass {
	
	@Test
	public void createrkTest(){
		RelatedKeyword ks =new RelatedKeyword();
	     ks.srch("Sarees");
	
	}
	
 
}

