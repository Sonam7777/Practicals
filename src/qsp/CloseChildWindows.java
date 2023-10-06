package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindows {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

   public static void main(String[] args) throws InterruptedException {
		 WebDriver d = new ChromeDriver();
    	 d.manage().window().maximize();
    	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	 d.get("https://demoqa.com/browser-windows");
    	 
    	 String parentwindow = d.getWindowHandle();
    	     
    	 d.findElement(By.id("tabButton")).click();
    	 d.findElement(By.id("windowButton")).click(); 
    	 d.findElement(By.id("messageWindowButton")).click();
    	 
    	 
    	 Set<String> allwindowid = d.getWindowHandles();
         for (String win : allwindowid) {
        	 
        	 if (!parentwindow.equals(win)) {
        		 d.switchTo().window(win);
        		 Thread.sleep(5000);
        		 d.close();	 
        	}
    		
        }
         
	}

}
