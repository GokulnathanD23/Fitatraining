package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.Baseclass;

public class Homepage extends Baseclass{
	
	By Homepage = By.xpath("");
	
	//Page Factory
	@FindBy(id = "//button[text()='PROCEED TO CHECKOUT")
	WebElement cartbutton;
	
	

}
