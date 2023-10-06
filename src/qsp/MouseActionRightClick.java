package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d = new ChromeDriver();
    	d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.actitime.com/");
		
		WebElement element = d.findElement(By.linkText(""));
		
		Actions a = new Actions(d);
		Thread.sleep(5000);
		a.contextClick(element).perform();
		
		Robot r =new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(5000);
		d.close();
	}

}
