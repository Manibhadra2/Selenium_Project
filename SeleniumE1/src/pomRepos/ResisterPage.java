package pomRepos;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class ResisterPage {

	
	

	public ResisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "Gender")
	private WebElement genderF;

	public void setGenderF(WebElement genderF) {
		this.genderF = genderF;
	}


	public WebElement getGenderF() {
		return genderF;
	}
	
	


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getConPass() {
		return conPass;
	}


	public WebElement getRegiButon() {
		return regiButon;
	}

	@FindBy(id = "FirstName")
	private WebElement firstname;
	
	@FindBy(id = "LastName")
	private WebElement lastname;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement conPass;
	
	
	@FindBy(id = "register-button")
	private WebElement regiButon;
	
	@FindBy(linkText = "Register")
	private WebElement ResisterLink;

	public WebElement getResisterLink() {
		return  ResisterLink;
}
}
