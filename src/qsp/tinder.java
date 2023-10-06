package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tinder {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver w = new ChromeDriver();
    	 w.manage().window().maximize();
    	 w.get("https://tinder.com/");
    	 Thread.sleep(5000);
         w.findElement(By.cssSelector("span[class='Px(24px) Py(8px)']")).click();
    	 Thread.sleep(5000);
         w.close();
	}

}
