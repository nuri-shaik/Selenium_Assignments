package selenium_Assignments;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4_MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\Chrome Version 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
        driver.get("https://devlabs-860f0.web.app/alert/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://amazon.in/')");
        js.executeScript("window.open('https://flipkart.com/')");
        
        System.out.println(driver.getTitle());
        
        String currentwindow = driver.getWindowHandle();
        System.out.println(currentwindow);
        
        ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(win.size());
        
        for(int i=0;i<win.size();i++) {
        	driver.switchTo().window(win.get(i));
        	driver.wait(20);
        	driver.close();
        }
	}

}
