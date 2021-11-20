package LearnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeardTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        driver.get("https://devlabs-860f0.web.app/table");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        int headerCount = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th")).size();
        System.out.println(headerCount);
        List<WebElement> l = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th"));
        		
        for (int i=0;i<headerCount;i++)
        {
        	System.out.println("Header - "+ i);
        	System.out.println(l.get(i).getText());
        }
        
        int rw = driver.findElements(By.xpath("//*[@id='table']/tbody/tr")).size();
        System.out.println("Rows Count - "+ rw);
        
        for(int i=1;i<=rw;i++)
        {
        	System.out.println("Row "+ i + "   Data.....");
        	for(int j=1; j<=headerCount; j++)
        	{
        		String val = driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]")).getText();
        		System.out.println(val);
        		
        		if (j==headerCount)
        		{
        			System.out.println(driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]/input")).isSelected());
        			driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]/input")).click();
        			System.out.println(driver.findElement(By.xpath("//*[@id='table']/tbody/tr["+i+"]/td["+j+"]/input")).isSelected());
        		}
        		
        	}
        }
	}

}
