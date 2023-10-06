package qsp;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMouseHover {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver d = new ChromeDriver();
    	 d.manage().window().maximize();
    	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	 d.get("https://www.vtiger.com/");
    	 
    	 WebElement element = d.findElement(By.partialLinkText("Resources"));
    	 
 		Actions a = new Actions(d);
 		Thread.sleep(5000);
 		a.moveToElement(element).perform();
 		d.findElement(By.partialLinkText("Contact"));
 		
 		String no = d.findElement(By.xpath("//p[contains(.,'9243602352')]")).getText();
 		System.out.println(no);
 		 
 		Thread.sleep(5000);
 		d.close();
	}

}
