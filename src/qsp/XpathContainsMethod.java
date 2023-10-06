package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.youtube.com/");
		w.findElement(By.xpath("//input[@id='search' ]")).sendKeys("Acer laptops");
	    w.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	    w.findElement(By.xpath("//yt-formatted-string[text()='Acer aspire 5 (2023) Review: Best budget laptop for Students!'] "));
		
	    
		

	}

}
