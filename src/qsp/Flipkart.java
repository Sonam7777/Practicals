package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
	WebDriver w = new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().window().maximize();
	w.findElement(By.name("q")).sendKeys("hp laptops");
	w.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	

	}

}

























































































































































































































































































































































































































































































































































































































































































































