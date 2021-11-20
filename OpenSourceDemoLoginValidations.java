package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceDemoLoginValidations {
	 static WebDriver driver;
	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub


	    	System.setProperty("webdriver.chrome.driver", "C:\\My Drive\\Ascendis\\Sofwares\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        OpenSourceDemoLoginValidations obj = new OpenSourceDemoLoginValidations();
	        obj.test("","");
	        obj.test("Admin","");
	        obj.test("","admin123");
	        obj.test("Admin","admin1234");
	        obj.test("Admin","admin123");
	  }
	    public void test(String username, String password) throws InterruptedException
	    {
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.findElement(By.id("txtUsername")).sendKeys(username);
	     driver.findElement(By.id("txtPassword")).sendKeys(password);
	     Thread.sleep(2000);
	     driver.findElement(By.id("btnLogin")).click();
	    
	    if(chkSpanMessagesExistence(driver))
	    {
	        System.out.println("Login failed");
	        System.out.println(driver.findElement(By.id("spanMessage")).getText());
	    }
	    else
	    {
	        System.out.println("Login passed");
	        driver.findElement(By.xpath("//a[contains(text(), 'Welcome Paul')]")).click();
	    }
	    }

	     public boolean chkSpanMessagesExistence(WebDriver driver)
	    {
	        boolean bflg=true;
	        try
	        {
	        if(driver.findElement(By.id("spanMessage")).isDisplayed())
	            System.out.println("present");
	        }catch (Exception e) {
	            // TODO: handle exception
	            bflg=false;
	        }
	        return bflg;
	    }
	
}
