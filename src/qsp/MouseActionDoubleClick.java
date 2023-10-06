package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClick {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	  WebDriver d = new ChromeDriver();
	   	d.manage().window().maximize();
	   	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	d.get("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement element = d.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	   
	   Actions a = new Actions(d);
	   Thread.sleep(5000);
	   
	   a.doubleClick(element).perform();
	   Thread.sleep(5000);
	   
	   Alert a1 = d.switchTo().alert();
       a1.accept();
       Thread.sleep(5000);
	   
	    d.close();
	   	 
	 }

}
