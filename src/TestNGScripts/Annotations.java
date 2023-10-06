package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite 
	public void databaseConnection() {
		Reporter.log("database connected",true);
		
	}
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("Browser is launched",true);
		
   }
	@BeforeMethod
	public void login() {
		Reporter.log("logged in sucessfully",true);
		
	}
	@Test
	public void createCustomer() {
		Reporter.log("customer created sucessfully",true);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout sucessfully",true);
		
	}
	@AfterSuite
	public void databaseDisconnect() {
		Reporter.log("database disconnected",true);
		
	}
	
}
