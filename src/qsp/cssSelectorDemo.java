package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
     public static void main(String[] args) throws InterruptedException {
       
    	 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
    	 w.get("https://demo.actitime.com/");
    	 Thread.sleep(2000);
         w.findElement(By.cssSelector("input[name = 'username'")).sendKeys("admin");
         Thread.sleep(2000);
         w.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
         Thread.sleep(2000);
         w.close();
	}

}