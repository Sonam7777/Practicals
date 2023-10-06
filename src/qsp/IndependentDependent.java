package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependent {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		w.findElement(By.name("q")).sendKeys("hp laptops");
		w.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		
		String price = w.findElement(By.xpath("//div[.='HP 247 G8 Athlon Dual Core - (8 GB/1 TB HDD/Windows 11 Home) 247 G8 Notebook Notebook']/../../../../../../div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(price);
		Thread.sleep(4000);
		w.close();
	}

}
