package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeExcel {
	
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
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
	   d.findElement(By.xpath("//div[.='Tasks']")).click();
	   d.findElement(By.xpath("//div[.='Add New']")).click();
	   d.findElement(By.xpath("//div[.='+ New Customer']")).click();
	   
	    FileInputStream fis1 = new FileInputStream("./Testdata/ExcelTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		
		String name = wb.getSheet("Demo").getRow(4).getCell(1).getStringCellValue();
		d.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
		
		String desc = wb.getSheet("Demo").getRow(4).getCell(2).getStringCellValue();
		d.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
		
		d.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(5000);
	    d.close();
		
	}

}
