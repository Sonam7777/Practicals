package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestFunctionActiTime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
		w.get("https://demo.actitime.com/");
        w.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        w.findElement(By.name("pwd")).sendKeys("manager");
        Thread.sleep(2000);
        w.findElement(By.xpath("//div[text( )='Login ']")).click();
        Thread.sleep(2000);
        w.close();
	}

}
