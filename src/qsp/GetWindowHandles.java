package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver d = new ChromeDriver();
    	 d.manage().window().maximize();
    	 d.get("https://demoqa.com/browser-windows");
    	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	 
    	 d.findElement(By.id("tabButton")).click();
    	 d.findElement(By.id("windowButton")).click();
    	 d.findElement(By.id("messageWindowButton")).click();
    	 
    	 
    	 Set<String> allwindowid = d.getWindowHandles();
    	 
    	 for (String win : allwindowid) {
    		 System.out.println(win);
    		 
    		 }
    	 
    	 d.close();
      
	}

}
