package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab1_OpenWebURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
		driver.close();
	}

}
