package LearnSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnBrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException{
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://devlabs-860f0.web.app/hyperlink");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        
        for(WebElement we:list)
        {
        	String url = we.getAttribute("href");
        	
        	if(url.isEmpty()||url==null)
        		System.out.println("URL - "+url+ " is Not Working");
        	else
        	{
        		try {

					HttpURLConnection hc = (HttpURLConnection) new URL(url).openConnection();
					hc.connect();

					int respCode = hc.getResponseCode();
					System.out.println(respCode);
					System.out.println(hc.getResponseMessage());

					if (respCode == 200)
						System.out.println("Working");
					else
						System.out.println("Not Working");

				} catch (Exception e) {
					e.printStackTrace();
				}
        	}
        }
	}

}
