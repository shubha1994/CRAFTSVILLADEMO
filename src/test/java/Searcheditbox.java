
package test.java;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import main.java.genericLib.*;

import main.java.ObjectRepository.*;

public class Searcheditbox extends Baseclass {

	@Test
	public void createBrandTest() {
		Searchpage sp = new Searchpage();
		sp.Brandkurthis();
		sp.Accessories();
		sp.Cart();
		sp.Sarees();
		sp.signup();
		sp.Salwarsuits();
		sp.sutavalengha();
	}

}
