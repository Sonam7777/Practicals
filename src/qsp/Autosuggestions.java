package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {
  
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		w.findElement(By.name("q")).sendKeys("iPhone14");
		Thread.sleep(5000);
		
		List<WebElement> allsugg = w.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
		int count= allsugg.size();
		
		for (int i = 0; i < count; i++) {
	    String sugg = allsugg.get(i).getText();
	    System.out.println(sugg);
			
		}
	    w.close();

	}

}
