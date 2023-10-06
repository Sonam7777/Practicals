package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectList {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://www.facebook.com/");
		w.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement element1 = w.findElement(By.id("day"));
		Select s = new Select(element1);
		s.selectByIndex(29);
		
		
	 WebElement element2 = w.findElement(By.id("month"));
	   Select s1 = new Select(element2);
	   s1.selectByVisibleText("Nov");
		
	   
	WebElement element3 = w.findElement(By.id("year"));
		Select s2 = new Select(element3);
		s2.selectByVisibleText("1995");
		   
		Thread.sleep(7);
	    w.close();
	}

}
