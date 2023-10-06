package TestNGScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class Football extends Baseclass {
	
	@Test
	public void messi() {
		Reporter.log("best football player",true);
		Assert.fail();
	}
	@Test
	public void ronaldo() {
		Reporter.log("best football player",true);
		Assert.fail();
	}
	
}
