package autoTestPackage;

import org.testng.annotations.Test;
import basePackage.BaseClass;

public class GetQuoteTest extends BaseClass {
	
	
	
	@Test
	public void qutationTest() {	
		webpagesElements.autoButtonMethod();
		webpagesElements.zipCodeMethod();
		webpagesElements.quoteMethod();			
	}

}
