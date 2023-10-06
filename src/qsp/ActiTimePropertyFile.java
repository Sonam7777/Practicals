package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimePropertyFile {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
       public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
			
		Properties p = new Properties();
		p.load(fis);
		
	    String link = p.getProperty("url");
		d.get(link);
		
	   String un = p.getProperty("username");
	   String pw = p.getProperty("password");
	   
	   d.findElement(By.id("username")).sendKeys(un);
	   d.findElement(By.name("pwd")).sendKeys(pw);
	   d.findElement(By.xpath("//div[.='Login ']")).click();  
	   Thread.sleep(5000);
	   d.close();
	   
	}

}
