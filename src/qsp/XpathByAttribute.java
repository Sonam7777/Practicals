package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://demo.actitime.com/");
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		w.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(5000);
		w.close();
		}

}
