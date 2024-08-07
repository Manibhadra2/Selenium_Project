package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement namefield = driver.findElement(By.name("username"));
		namefield.sendKeys(Keys.CONTROL+"A");
		namefield.sendKeys("chintu",Keys.CONTROL+"c");
		
		 WebElement pass = driver.findElement(By.name("password"));
		 pass.sendKeys("123",Keys.CONTROL+"v");
	}

}
