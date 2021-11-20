package LearnSelenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        driver.get("https://devlabs-860f0.web.app/table");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        TakesScreenshot srcShot = ((TakesScreenshot)driver);
        File Src = srcShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Src, new File("Table.png"));
	}

}
