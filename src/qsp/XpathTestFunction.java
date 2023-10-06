package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestFunction {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
    	 w.get("https://www.youtube.com/");
    	 w.findElement(By.xpath("//input[@id='search']")).sendKeys("gate way of india");
    	 w.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
    	 w.findElement(By.xpath("//yt-formatted-string[text()='Mumbai tour Guide | Elephanta caves Mumbai | Gateway of India Hotel Taj Tour']")).click();
    	 
    	 w.close();
    	 
  }

}
