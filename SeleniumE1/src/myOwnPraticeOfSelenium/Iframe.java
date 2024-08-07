package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Business Solutions")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("About Us")).click();
	}

}
