package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependentDependent {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/");
		w.manage().window().maximize();
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone14");
		w.findElement(By.id("nav-search-submit-button")).click();
		String price = w.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Starlight']/../../../../../../../div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[2]")).getText();
		System.out.println(price);
		
		Thread.sleep(4000);
		w.close();

	}

}
