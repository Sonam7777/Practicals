package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
        w.get("https://www.zomato.com");
        w.manage().window().maximize();
        
        int x=  w.findElement(By.xpath("(//img[@class='sc-s1isp7-5 jQwYOW'])[1]")).getRect().getX();
        System.out.println(x);
        
        int y=  w.findElement(By.xpath("(//img[@class='sc-s1isp7-5 jQwYOW'])[1]")).getRect().getY();
        System.out.println(y);

        w.close();
        
       }

}
