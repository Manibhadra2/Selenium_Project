package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {

	
	@FindBy(linkText = "Register")
	private WebElement register;
	
	
	@FindBy(linkText = "Log in")
	private WebElement Login;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement Shoppingcart;
}
