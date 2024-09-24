package StepDefinition;

import Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass{
	@Given("lets shop url is loaded")
	public void lets_shop_url_is_loaded() throws InterruptedException {
	    OpenURL();
	}
	@When("user click on {String}product to Add")
	public void user_click_on_product_to_add(String String) {
	    Homepage homepage = Homepage();
	    Homepage.Addproduct(String)
;	}
	@When("user enters the email")
	public void user_enters_the_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user enters the password")
	public void user_enters_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		getelementByID(Path).sendkeys(String);
	}
	
	@When ("^user clicks on \"(.*)\" product to add")
	public void user_click_on_product_to_add(Sring products) {
		homepage homepage = new homepage();
		homepage.addproduct(products);
	}
	
	
	@When("user adds fashion product")
	public void user_adds_fashion_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
