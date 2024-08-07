package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndScenarion {

	public static void main(String[] args) throws InterruptedException {
		
		//expected data
		String expectedUsername="Chintu@gmail.com";
		String expectedpassword="chintu123";
		String expectedLoginPageTitle="Facebook – log in or sign up";
		Thread.sleep(2000);
		
		
		//open the broswer
		WebDriver driver=new ChromeDriver();
		System.out.println("Broswer got open successfully");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("broswer got maximize successfuly");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		//enter the url
		driver.get("https://www.facebook.com/");
		String actualLoginPageTittle=driver.getTitle();
		if(actualLoginPageTittle.equals(expectedLoginPageTitle))
		{
			System.out.println("successfully navigate to login page");
		}
		else
		{
			System.out.println("failed to navigate to login page");
		}

		
		
		//enter the username
		WebElement userNameTextfield = driver.findElement(By.id("email"));
		userNameTextfield.clear();
		userNameTextfield.sendKeys(expectedUsername);
		String ActualUserName=userNameTextfield.getAttribute("value");
		if(ActualUserName.equals(expectedUsername))
		{
			System.out.println("username Textfield accepted data");
		}
		else System.out.println("username not acceptd data");
		
		
		
		
		//enter password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedpassword);
		String actualPassword=passwordTextfield.getAttribute("value");
		if(expectedpassword.equals(actualPassword))
		{
			System.out.println("password Accepted data");
		}
		else
		{
			System.out.println("not accepted data");
		}
		
		
		//click on login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		System.out.println("home page is displayed");
		
		
		//to close the broswer
		System.out.println("broswer got close successfully");
		driver.quit();
	}

}
