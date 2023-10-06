package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		 WebDriver d = new ChromeDriver();
    	 d.manage().window().maximize();
    	 d.get("https://www.flipkart.com/");
    	 
    	 String windowid = d.getWindowHandle();
    	 System.out.println(windowid);
    	 d.close();
    	
	}

}
