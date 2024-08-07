package assignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import takeScreenShot.GetScreenShotAs;

public class Saucedemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//identify element
		WebElement username = driver.findElement(By.id("login_credentials"));
		
		driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("login_credentials"));
        
		Actions action=new Actions(driver);
		action.dragAndDrop(username, password).perform();
		 
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File src=new File("./error/saucedemo.jpeg");
	}

}
