package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
   
		
		@DataProvider(name = "cred")
		public String[][] toSendData()
		{
			 
			String sarr [][]= {
					{"abhi@gmail.com","abhi@123"},
					{"shiva@gmail.com","shiba@123"},
					{"jintu@gmail.com","jintu@123"}
					};
			return sarr;
		}
		
		@Test(dataProvider="cred")
		public void login(String username,String pass)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/register");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("FirstName")).sendKeys(username);
			driver.findElement(By.id("LastName")).sendKeys(pass);
			
		}
	}

