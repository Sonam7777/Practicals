package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectRepository.LoginPage;

public class RefreshPage {
	
	
	@Test
	public void actitimeLogin() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	LoginPage lp = new LoginPage(driver);
	
	lp.getUsernamefield().sendKeys("admin");
	Thread.sleep(3000);
	
    driver.navigate().refresh();
	Thread.sleep(3000);
	lp.getUsernamefield().sendKeys("admin");
	lp.getPasswordfield().sendKeys("manager");
	lp.getSelectcheckbox().click();
	lp.getLoginbutton().click();
	
	Thread.sleep(3000);
	driver.close();
	
	}
	

}
