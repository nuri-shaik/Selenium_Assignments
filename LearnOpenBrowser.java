package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win321\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        //driver.get("https://rbc2qa.sps.broadridge.com//gfw//LogOn.jsp");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        /*
        driver.navigate().to("https://www.google.com");
        
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/
        
        driver.close();
	}

}
