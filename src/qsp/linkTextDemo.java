package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextDemo {
 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/");
		Thread.sleep(2000);
		w.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		w.findElement(By.name("firstname")).sendKeys("geetanjali");
		w.findElement(By.name("lastname")).sendKeys("patil");
		w.findElement(By.name("reg_email__")).sendKeys("geet777@gmail.com");
	    w.findElement(By.id("password_step_input")).sendKeys("qspider1234");
		Thread.sleep(3000);
		w.close();

	}

}