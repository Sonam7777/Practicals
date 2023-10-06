package qsp;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	   	 d.manage().window().maximize();
	   	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	 
	   	 d.get("https://www.bbc.com/");
	   	 
	   	JavascriptExecutor j = (JavascriptExecutor) d ;
	   	Thread.sleep(5000);
	   	
	   	j.executeScript("window.scrollBy(0,2000)");
	   	Thread.sleep(5000);
	   	
	   	j.executeScript("window.scrollBy(0,-2000)");
	   	Thread.sleep(5000);
	   	
	   	 d.close();
	   	 
	}

}
