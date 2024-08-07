package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement emai = driver.findElement(By.id("email"));
		 
		 emai.sendKeys("mani@123");
		 Thread.sleep(2000);
		 emai.clear();

	}

}
