package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup{
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
		w.get("https://demo.actitime.com/");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        w.findElement(By.id("username")).sendKeys("admin");
        w.findElement(By.name("pwd")).sendKeys("manager");
        w.findElement(By.xpath("//div[text( )='Login ']")).click();
        
        w.findElement(By.xpath("//div[.='Tasks']")).click();
        w.findElement(By.xpath("//div[.='Add New']")).click();
        w.findElement(By.xpath("//div[.='+ New Customer']")).click();
        w.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("geetanjali");
        w.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
        Thread.sleep(4000);
        
        Alert a = w.switchTo().alert();
        a.accept();
        
        Thread.sleep(4000);
        w.close();
		
		

	}

}
