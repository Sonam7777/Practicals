package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {

	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("file:///C:/Users/Shree/Desktop/RolexHotel.html");
		
		WebElement element = w.findElement(By.id("food"));
		Select s = new Select(element);
		
		s.selectByVisibleText("Biryani ");
		Thread.sleep(4000);
		
		s.selectByVisibleText("Chicken lollypop ");
		Thread.sleep(4000);
		
		s.selectByVisibleText("Dora cake ");
		Thread.sleep(4000);
		
		s.deselectByIndex(1);
		Thread.sleep(4000);
		
		s.deselectAll();
		Thread.sleep(4000);
		w.close();
	}

}
