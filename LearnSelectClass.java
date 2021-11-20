package LearnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        driver.get("https://devlabs-860f0.web.app/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement we = driver.findElement(By.xpath("//*[@id='Index']"));
        
        Select sel = new Select(we);
        
        System.out.println(sel.isMultiple());
        
        sel.selectByIndex(1);
        sel.selectByValue("2");
        sel.selectByVisibleText("Orange");
        
        we=driver.findElement(By.xpath("/html/body/app-root/app-dropdown/body/div/div/div/div/div/div[2]/select"));
        sel = new Select(we);
        sel.selectByVisibleText("Good");
        
        we=driver.findElement(By.xpath("//*[@id=\"dropdownBasic1\"]"));
        we.click();
            
        
       // System.out.println(sel.getFirstSelectedOption().getText());
	}

}
