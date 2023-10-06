package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
        w.get("https://www.zomato.com");
        w.manage().window().maximize();
        
        int h= w.findElement(By.xpath("//img[@alt='Zomato logo']")).getRect().getHeight();
        System.out.println(h);
        
       int wd=  w.findElement(By.xpath("//img[@alt='Zomato logo']")).getRect().getWidth();
       System.out.println(wd);
       
       int x=  w.findElement(By.xpath("//img[@alt='Zomato logo']")).getRect().getX();
       System.out.println(x);
       
       int y=  w.findElement(By.xpath("//img[@alt='Zomato logo']")).getRect().getY();
       System.out.println(y);

       w.close();
       
     }

}
