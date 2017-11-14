
package test.java;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import main.java.genericLib.*;

import main.java.ObjectRepository.*;

public class KeywordsearchTest extends Baseclass {

	@Test
	public void KsTest() {
		Keywordsearch ks = new Keywordsearch();
		ks.srch("Sarees");

	}

}
