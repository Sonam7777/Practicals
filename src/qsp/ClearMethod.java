package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
    public static void main(String[] args) throws InterruptedException {
    	WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/");
		Thread.sleep(5000);
		w.findElement(By.id("email")).sendKeys("prospiders thane");
		Thread.sleep(5000);
		w.findElement(By.id("email")).clear();
		Thread.sleep(5000);
		w.close();
		
	}

}