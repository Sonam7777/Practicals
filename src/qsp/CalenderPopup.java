package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
		w.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		w.findElement(By.id("policynumber")).sendKeys("123");
		w.findElement(By.id("dob")).click();
		
		WebElement element1 = w.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 =new Select(element1);
		s1.selectByVisibleText("Jun");
		Thread.sleep(5000);
		
		WebElement element2 = w.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 =new Select(element2);
		s2.selectByVisibleText("2007");
		Thread.sleep(5000);
		
		w.close();
		
		
		

	}

}
