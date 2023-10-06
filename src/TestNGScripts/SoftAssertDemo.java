package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo  {
	
	@Test
	public void titleCompare() {
	 WebDriver d = new ChromeDriver();
   	 d.manage().window().maximize();
   	 d.get("https://www.google.com/");
   	 
   	 String expectedtitle="ffffoogle";
   	 String actualtitle = d.getTitle();   
   	 
   	 SoftAssert s = new SoftAssert();
     s.assertEquals(actualtitle, expectedtitle);
   	 
   	 d.close();
   	 s.assertAll();
	
   }

}
