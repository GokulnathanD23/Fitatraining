package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	WebDriver driver;
	
	public Cartpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		@FindBy
	}

}
