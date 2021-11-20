package LearnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        driver.get("https://devlabs-860f0.web.app/frame");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List<WebElement> we = driver.findElements(By.tagName("iframe"));
        System.out.println(we.size());
        /*
        for (int i=0;i<=we.size();i++)
        {
        	System.out.println(we.get(i).getAttribute("name"));
        	System.out.println(we.get(i).getAttribute("id"));
        }*/
        
        String txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1")).getText();
        System.out.println(txt);
        
        driver.switchTo().frame("loginFrame");
        
        driver.findElement(By.id("username")).sendKeys("testUser");
        driver.findElement(By.id("password")).sendKeys("password");
        
        driver.switchTo().parentFrame();
        
        txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1")).getText();
        System.out.println(txt);
        
	}

}
