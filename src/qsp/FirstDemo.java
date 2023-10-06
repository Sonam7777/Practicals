package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://www.instagram.com/");
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.close();
		}
}
