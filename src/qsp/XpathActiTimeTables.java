package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiTimeTables {
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
        Thread.sleep(4000);
        
        w.findElement(By.xpath("(//div[@class='popup_menu_icon'])[1]")).click();
        Thread.sleep(5000);
        
        w.findElement(By.xpath("//a[text()='Types of Work']")).click();
        Thread.sleep(5000);
        
        String value = w.findElement(By.xpath("//a[text()='engineering']/../../td[4]")).getText();
        System.out.println(value);
        
        w.close();

	}

}
