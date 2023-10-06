package qsp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeGenericLibrary {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		GenericMethods gm = new GenericMethods();
		
		String URL = gm.readDataFromPropertyFile("url");
		d.get(URL);
		
	   String un = gm.readDataFromPropertyFile("username");
	   d.findElement(By.id("username")).sendKeys(un);
	   
	   String pw = gm.readDataFromPropertyFile("password");
	   d.findElement(By.name("pwd")).sendKeys(pw);
	   
	   d.findElement(By.xpath("//div[.='Login ']")).click();  
	   d.findElement(By.xpath("//div[.='Tasks']")).click();
	   d.findElement(By.xpath("//div[.='Add New']")).click();
	   d.findElement(By.xpath("//div[.='+ New Customer']")).click();
	   
	   String name = gm.readDataFromExcel("Demo", 4, 1);
	   d.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
		
		String desc = gm.readDataFromExcel("Demo", 4, 2);
		d.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
		
		d.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(5000);
	    d.close();
		}

}
