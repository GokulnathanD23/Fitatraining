package fita.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test001 {
	
	static WebDriver driver;
	static String product;
	static WebDriverWait wait ;
    // (priority = 1)
	public void OpenURL() throws InterruptedException {
		
		String path ="C:\\Users\\dkavi\\eclipse-workspace\\ECommerceTest\\drivers\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		

		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		
		driver.findElement(By.id("userEmail")).sendKeys("Raj23@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Raj@12345");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		
		
//	String actual = driver.findElement(By.xpath("//button[text()='HOME']")).getText();
//	Assert.assertEquals(actual, "HOME");
		
		
	}
    // (priority = 2)
     public void addproduct () throws InterruptedException {
    	 
    	 Thread.sleep(3000);
    	 
    	driver.findElement(By.xpath("//b[contains(text(),'IPHONE 13 PRO')]/../following-sibling::button[text()=' Add To Cart']")).click();
    	 
    	product=driver.findElement(By.xpath("//b[contains(text(),'IPHONE 13 PRO')]")).getText();
    	 
    	 
    	 Thread.sleep(3000);
    	 
    	 
     }
     
     private void takescreenshot() throws IOException {
    	 File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(scrFile, new File(""));
 		
 		
 		
 	}
 
     
     public void checkproductaddded() throws InterruptedException {
    	 
    	 WebElement cartbutton=driver.findElement(By.xpath("//button[contains(text(),'Cart')]"));
    //	 Thread.sleep(3000);
    	 cartbutton.click();
    	 String productatcart = driver.findElement(By.xpath("///div[@class='cartsection]'")).getText();
    	 Assert.assertEquals(product, productatcart);
    	 
    	
    	 
    Thread.sleep(2000);
    driver.quit();
    
    
    	 
     }
}

	
