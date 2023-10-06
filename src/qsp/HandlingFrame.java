package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver d = new ChromeDriver();
   	 d.manage().window().maximize();
   	 d.get("file:///C:/Users/Shree/Desktop/Page1.html");
   	 
   	 d.findElement(By.id("abc")).sendKeys("Qsp");
   	 
   	 d.switchTo().frame(0);
   	 d.findElement(By.id("xyz")).sendKeys("Jsp");
   	 
   	 d.switchTo().parentFrame();
   	 d.findElement(By.id("abc")).sendKeys(" training");
   	 
   	 Thread.sleep(5000);
   	 
   	 d.close();
   	 
	}

}
