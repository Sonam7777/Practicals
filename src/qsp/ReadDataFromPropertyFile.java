package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
	 FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		
	 Properties p = new Properties();
	 p.load(fis);
		
	 String pw = p.getProperty("password");
	 String un = p.getProperty("username");
	 String url = p.getProperty("url");
		
	
	System.out.println(pw);
	System.out.println(un);
	System.out.println(url);
	
	}

}
