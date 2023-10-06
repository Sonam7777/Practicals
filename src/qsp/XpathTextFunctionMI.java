package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextFunctionMI {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.youtube.com");
		w.findElement(By.name("search_query")).sendKeys("mumbai indians");
		w.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
   	    w.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
   	    
        Thread.sleep(7000);
		w.close();

	}

}

