package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
   public static void main(String[] args) throws InterruptedException {
	   WebDriver w = new ChromeDriver();
	   w.manage().window().maximize();
	   w.get("https://www.amazon.in/");
	   
	   w.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 14");
	   
	   w.findElement(By.id("nav-search-submit-button")).click();
	   Thread.sleep(3000);
	   String text= w.findElement(By.xpath("//yt-formatted-string[text() = 'Introducing iPhone 14 Pro | Apple']")).getText();
	   System.out.println(text);
	   Thread.sleep(3000);
	   w.close();

	}

}
