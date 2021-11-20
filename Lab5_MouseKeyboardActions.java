package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5_MouseKeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
        WebElement we = driver.findElement(By.id("txtUsername"));
        we.sendKeys("Admin");
        
        we = driver.findElement(By.id("txtPassword"));
        we.sendKeys("admin123");
        
        we = driver.findElement(By.id("btnLogin"));
        we.click();
        
        driver.close();
	}

}
