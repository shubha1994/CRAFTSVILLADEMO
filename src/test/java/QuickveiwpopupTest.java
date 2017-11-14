
package test.java;

import org.testng.annotations.Test;

import main.java.genericLib.*;

import main.java.ObjectRepository.*;

public class QuickveiwpopupTest extends Baseclass {

	@Test
	public void KsTest() {
		Quickveiwpopup ks = new Quickveiwpopup();
		ks.prdt();
		ks.quickveiw();

	}

}
