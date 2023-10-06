package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	 WebDriver d = new ChromeDriver();
   	 d.manage().window().maximize();
   	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   	 d.get("");
   	 
   	 WebElement src = d.findElement(By.xpath(""));
   	 WebElement dest = d.findElement(By.xpath(""));
   	 
   	 Thread.sleep(5000);
   	 
   	 Actions a = new Actions(d);
   	 a.dragAndDrop(src, dest);
   	 d.close();
   	 
   	 

	}

}
