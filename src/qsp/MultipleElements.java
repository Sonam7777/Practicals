package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		
		w.get("https://www.amazon.in/");
		w.manage().window().maximize();
		Thread.sleep(3000);	
		
	    List<WebElement> alllinks = w.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
		String link = alllinks.get(i).getText();
		System.out.println(link);
		 
		}
	    Thread.sleep(3000);
	    w.close();

	}

}
