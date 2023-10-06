package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
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
        w.findElement(By.id("logoutLink")).click();
        w.close();

	}

}
