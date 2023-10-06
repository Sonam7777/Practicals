package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class kesariya {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.youtube.com/");
		d.findElement(By.name("search_query")).sendKeys("kesariya");
		d.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		d.close();
		
		
}
}

