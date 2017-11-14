
package test.java;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import main.java.genericLib.*;

import main.java.ObjectRepository.*;

public class OrdertrackinglinkTest extends Baseclass {

	@Test
	public void KsTest() {
		Paymentrelatedlink ks = new Paymentrelatedlink();
		ks.prdt();
		ks.cntct();
		ks.ortlink();

	}

}
