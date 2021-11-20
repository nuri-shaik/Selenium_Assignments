package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2_GoogleSearchXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        
		driver.close();
	}

}
