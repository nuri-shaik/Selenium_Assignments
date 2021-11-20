package selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2_PrintTitleURLSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        
		driver.close();
	}

}
