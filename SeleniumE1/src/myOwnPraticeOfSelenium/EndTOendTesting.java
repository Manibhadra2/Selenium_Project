package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndTOendTesting {

	public static void main(String[] args) throws InterruptedException {
		//expected data
		String expectedusername="Laouda@123";
		String expectedpassword="123456";
		String expectedTittle="Facebook – log in or sign up";
        
		//open the broswer
		WebDriver driver=new ChromeDriver();
		System.out.println("broswer got open");
		driver.manage().window().maximize();
		System.out.println("broswer got maximize");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//enter url
		driver.get("https://www.facebook.com/");
		String actualLoginTittle = driver.getTitle();
		if(expectedTittle==actualLoginTittle)
		{
			System.out.println("succesfully navigate to login page");
		}
		else {
			System.out.println("failed to navigate login page");
		}
		
		
		//enter the username
		WebElement usernametextfield = driver.findElement(By.id("email"));
		
		usernametextfield.sendKeys(expectedusername);
		String actualusername = usernametextfield.getAttribute("value");
		if(actualusername.equals(expectedusername))
		{
			System.out.println("usernametextfield accept data");
		}
		else System.out.println("it is not accept data");
		

		
		//enter password
		WebElement PasswordTextfield = driver.findElement(By.id("pass"));
		PasswordTextfield.clear();
		PasswordTextfield.sendKeys(expectedpassword);
		String actualPassword = PasswordTextfield.getAttribute("value");
		if(actualPassword==expectedpassword) {
			System.out.println("PasswordTextfield accept data");
		}
		else System.out.println("PasswordTextfield not accept data");
		
		//click on login button
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		System.out.println("home page should be displayed");
		
		
		//close the broswer
	
		driver.quit();
		System.out.println("broswer got closed");
	}

}
