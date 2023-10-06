package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorfb {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
    	 w.get("https://www.facebook.com/");
    	 
    	 w.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    	 w.findElement(By.name("firstname")).sendKeys("geetanjali");
 		w.findElement(By.name("lastname")).sendKeys("patil");
 		w.findElement(By.name("reg_email__")).sendKeys("geet777@gmail.com");
 	    w.findElement(By.id("password_step_input")).sendKeys("qspider1234");
         Thread.sleep(2000);
         w.close();
	}

}
