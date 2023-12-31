package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
       public static void main(String[] args) throws AWTException, InterruptedException {
	
		 WebDriver d = new ChromeDriver();
    	 d.manage().window().maximize();
    	 d.get("https://www.instagram.com/");
    	 
    	 Robot r = new Robot();
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	 r.keyPress(KeyEvent.VK_S);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
    	 Thread.sleep(5000);
    	 
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 Thread.sleep(5000);
    	 
    	 r.keyPress(KeyEvent.VK_TAB);
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 Thread.sleep(5000);
    	 
    	 d.close();
    }

}
