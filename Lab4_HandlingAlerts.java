package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4_HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("https://devlabs-860f0.web.app/alert/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[@id=\"12345rtf\"]")).click();
        Alert a1 = driver.switchTo().alert();
        a1.accept();
                
        driver.findElement(By.xpath("//*[@id=\"zxcvbnm\"]")).click();
        a1 = driver.switchTo().alert();
        a1.dismiss();
        
        driver.findElement(By.xpath("//*[@id=\"aswdefr\"]")).click();
        a1 = driver.switchTo().alert();
        a1.sendKeys("Automation");
        a1.accept();
        
        driver.close();
	}

}
