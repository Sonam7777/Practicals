package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
		w.get("https://demo.actitime.com/");
		
        w.findElement(By.id("username")).sendKeys("admin");
        w.findElement(By.name("pwd")).sendKeys("manager");
        w.findElement(By.xpath("//div[text( )='Login ']")).click();
        
        WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Enter"));
        w.findElement(By.id("logoutLink")).click();
        
        Thread.sleep(5000);
        w.close();

     }

}
