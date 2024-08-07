package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCLass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
	      driver.findElement(By.id("password")).sendKeys("9868746876htefgdfyfqw7657xb7t6");
		   WebElement eyeICon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		   
		   Actions ac=new Actions(driver);
		   
		   ac.contextClick().perform();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
//		   ac.clickAndHold(eyeICon).perform();
//		   Thread.sleep(2000);
//		   
//		   ac.release().perform();
	}

}
