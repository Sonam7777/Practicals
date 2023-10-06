package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver w = new ChromeDriver();
   	    w.manage().window().maximize();
		w.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(5000);
		w.close();
		
	}

}
