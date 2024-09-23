package Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Fita.Utilities.Utilities;

public class Baseclass {

	private static final String Webelement = null;
	static WebDriver driver;
	static String product;
	static WebDriverWait wait ;
	
	public static ExtentReports Extent;
     public	static ExtentTest test;
     @Test(priority = 1)
	public void OpenURL() throws InterruptedException {
		String path ="C:\\Users\\dkavi\\eclipse-workspace\\ECommerceTest\\drivers\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		 ExtentSparkReporter Reporter = new ExtentSparkReporter("extentReports");
	        Extent = new ExtentReports();
	        Extent.setSystemInfo("owner", "fita");
	        Extent.setSystemInfo("system", "windows");
	        Extent.setSystemInfo("browser", "chrome");
	        Extent.setSystemInfo("Environment", "SIT");
	       
	        Extent.attachReporter(Reporter);
		

		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement getelementByID (String key) {
				String Locator = Utilities.getlocator(key);
				WebElement ele = driver.findElement(By.id(Locator));
				return ele;
		}

}
    public void quit() throws InterruptedException { 
    	 Thread.sleep(2000);
    	    driver.quit();
    }
}

