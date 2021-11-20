package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
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
        
        driver.findElement(By.partialLinkText("Welcome")).click();
        
        int i=0;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link:links){
        	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
        	 i++;
        	 }
        System.out.println("Total Links on this page is:- "+ i);
        driver.close();
	}

}
