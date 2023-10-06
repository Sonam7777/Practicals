package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
	
	@Test
	public void titleCompare() {
	 WebDriver d = new ChromeDriver();
   	 d.manage().window().maximize();
   	 d.get("https://www.google.com/");
   	 
   	 String expectedtitle="google";
   	 String actualtitle = d.getTitle();   
   	 
   	 Assert.assertEquals(actualtitle, expectedtitle);
   	 
   	 d.close();
   	 
  }	

}
