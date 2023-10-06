package TestNGScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	public static WebDriver driver;
	@BeforeSuite 
	public void databaseConnection() {
		Reporter.log("Database connected",true);
	}
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("Browser is launched",true );
     }
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text( )='Login ']")).click();
		Reporter.log("Logged in sucessfully",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout sucessfully",true);
		
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		Reporter.log("logout sucessfully",true);
	}
	@AfterSuite
	public void databaseDisconnect() {
		Reporter.log("database disconnected",true);
		
	}
}

