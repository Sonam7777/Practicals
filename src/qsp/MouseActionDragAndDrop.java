package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDrop {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver d = new ChromeDriver();
	   d.manage().window().maximize();
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   d.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	   	
	   WebElement src = d.findElement(By.xpath("//h1[.='Block 1']"));
	   
	   WebElement dest = d.findElement(By.xpath("//h1[.='Block 4']"));
	   
	   Actions a = new Actions(d);
	   Thread.sleep(5000);
	   
	   a.dragAndDrop(src, dest).perform();
	   Thread.sleep(5000);
	   
	    d.close();
	   
	   }

}
