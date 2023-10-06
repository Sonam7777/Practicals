package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDemo {
	

	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.get("https://mu.ac.in/");
	    Thread.sleep(5000);
	    d.close();
	}
}
