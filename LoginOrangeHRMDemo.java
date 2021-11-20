package LearnSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        WebElement we = driver.findElement(By.id("txtUsername"));
        we.sendKeys("Admin");
        
        we = driver.findElement(By.id("txtPassword"));
        we.sendKeys("admin123");
        
        we = driver.findElement(By.id("btnLogin"));
        we.click();
        
   
        driver.findElement(By.linkText("Welcome Anton")).click();
        driver.findElement(By.linkText("Logout")).click();
        //System.out.println("The title of this page is:- " + we.);
	}

}
