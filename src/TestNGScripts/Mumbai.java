package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai extends Baseclass {
	
	@Test
	public void mayaNagari() {
		Reporter.log("Mumbai is dream city",true);
		
	}
	@Test
	public void dhoni() {
		Reporter.log("Caption cool",true);
	}
	
}
