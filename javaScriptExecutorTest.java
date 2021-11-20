package LearnSelenium;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    
        driver.get("https://google.com/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://amazon.in/')");
        js.executeScript("window.open('https://flipkart.com/')");
        
        System.out.println(driver.getTitle());
        
        String currentwindow = driver.getWindowHandle();
        System.out.println(currentwindow);
        
        Set<String> str = driver.getWindowHandles();
        System.out.println(str.size());
        
        Iterator<String> itr = str.iterator();
               
        while(itr.hasNext()) {
        	String ChildWindow = itr.next();
        	
        	if(driver.switchTo().window(ChildWindow).getTitle().equals("Amazon.com. Spend less. Smile more.")) {
        		System.out.println(driver.getTitle());
        		driver.close();
        	}
        }
            
	}

}
