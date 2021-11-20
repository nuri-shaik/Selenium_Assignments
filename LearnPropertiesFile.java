package LearnSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LearnPropertiesFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		InputStream ioStream = new FileInputStream("src/main/resources/test.properties");
		p.load(ioStream);
		
		System.out.println("url");
		System.out.println("url1");
	}

}
