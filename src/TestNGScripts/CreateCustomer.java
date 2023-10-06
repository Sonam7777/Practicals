package TestNGScripts;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	
	
	@Test (invocationCount = 5 ,priority = 2)
	public void createCustomer() {
	Reporter.log("customer created",true);
	}
	
	
	@Test(priority = 4 ,enabled = false)
	public void deleteCustomer() {
		Reporter.log("customer deleted",true);
	}
	
	
	@Test (priority = 1)
	public void editCustomer() {
		Reporter.log("customer edited",true);
	}
	
	@Test(priority = 3)
	public void modifyCustomer() {
		Reporter.log("customer modified",true);
		
	}
	
}
