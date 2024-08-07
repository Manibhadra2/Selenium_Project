package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

		public WelcomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getRegister() {
			return register;
		}


		public WebElement getLoginLink() {
			return loginLink;
		}


		public WebElement getShoppingKartLink() {
			return shoppingKartLink;
		}


		public WebElement getWishlist() {
			return wishlist;
		}


		public WebElement getBooks() {
			return Books;
		}


		public WebElement getComputer() {
			return computer;
		}

		
		
		
		@FindBy(id = "Email")
		private WebElement emailLink;
		
		@FindBy(id = "Password")
		private WebElement passLink;
		
		
		
		@FindBy(partialLinkText = "Register")
		private WebElement register;
		
		@FindBy(linkText = "Log in")
		private WebElement loginLink;
		
		@FindBy(xpath = "//span[text()='Shopping cart']")
		 private WebElement shoppingKartLink;
	    
		@FindBy(xpath = "//span[text()='Wishlist']")
		private WebElement wishlist;
		
		@FindBy(partialLinkText = "Books")
		private WebElement Books;
		
		
		@FindBy(partialLinkText = "Computers")
		private WebElement computer;
		
}
