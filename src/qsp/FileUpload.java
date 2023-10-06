package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
   	    w.manage().window().maximize();
		w.get("https://www.foundit.in/");
		
		w.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		
	    File f=	new File("./Testdata/sonam.pdf");
	    String path = f.getAbsolutePath();
	    Thread.sleep(5000);
	    
	    w.findElement(By.id("file-upload")).sendKeys(path);
	    Thread.sleep(5000);
	    w.close();
		
	

	}

}
