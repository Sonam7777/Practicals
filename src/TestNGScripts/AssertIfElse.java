package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertIfElse {
	
	@Test
	public void titleCompare() {
	 WebDriver d = new ChromeDriver();
   	 d.manage().window().maximize();
   	 d.get("https://www.google.com/");
   	 
   	 String expectedtitle="Google";
   	 String actualtitle = d.getTitle();   
   	 
   	 if(expectedtitle.equals(actualtitle)) {
   	     Reporter.log("Title is matching",true);
   	     
   	 }
   	 
   	 else {
   		 Reporter.log("Title is not matching",true);
   	 }
   	 d.close();
   }
	
}
