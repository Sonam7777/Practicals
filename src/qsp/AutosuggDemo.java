package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggDemo {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.manage().window().maximize();
		Thread.sleep(3000);
		
		w.findElement(By.name("q")).sendKeys("github");
		Thread.sleep(3000);
		List<WebElement> allsugg = w.findElements(By.xpath("//div[@class='pcTkSc']"));
        int count= allsugg.size();
        System.out.println(count);
        
		for (int i = 0; i < count; i++) {
			String sugg = allsugg.get(i).getText();
			System.out.println(sugg);
			
		}
		Thread.sleep(3000);
		 w.close();
	}

}
