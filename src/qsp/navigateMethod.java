package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(5000);
		w.navigate().to("file:///C:/Users/Shree/Desktop/WebPage.html");
		Thread.sleep(5000);
		w.findElement(By.id("zabba")).click();
		Thread.sleep(5000);
		w.navigate().back();
		Thread.sleep(5000);
		w.findElement(By.id("pappu")).click();
		w.navigate().forward();
		Thread.sleep(5000);
		w.navigate().refresh();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(5000);
		w.quit();
		
	}

}
