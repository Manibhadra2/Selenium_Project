package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emaillink;

	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getPasswordLink() {
		return passwordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getBookLink() {
		return BookLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicLink() {
		return ElectronicLink;
	}

	public WebElement getApearShoes() {
		return ApearShoes;
	}

	public WebElement getDigitalDownLink() {
		return digitalDownLink;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGift() {
		return gift;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getFollowus() {
		return followus;
	}

	@FindBy(id = "Password")
	private WebElement passwordLink;
	
	
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement loginButton;
	
	@FindBy(partialLinkText = "Books\r\n")
	private WebElement BookLink;
	
	@FindBy(partialLinkText = "Computers\r\n")
	private WebElement computerLink;
	
	
	@FindBy(partialLinkText = "Electronics\r\n")
	private WebElement ElectronicLink;
	 
	@FindBy(partialLinkText = "Apparel & Shoes\r\n")
	private WebElement ApearShoes;
	
	@FindBy(partialLinkText = "Digital downloads\r\n")
	private WebElement digitalDownLink;
	
	@FindBy(partialLinkText = "Jewelry\r\n")
	private WebElement jewelry;
	
	@FindBy(partialLinkText = "Gift Cards\r\n")
	private WebElement gift;
	
	@FindBy(xpath = "//h3[text()='Information']")
	private WebElement info;
	
	@FindBy(xpath = "//h3[text()='Customer service']")
	private WebElement customer;
	
	@FindBy(xpath = "//h3[text()='My account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//h3[text()='Follow us']")
	private WebElement followus;
	
}
