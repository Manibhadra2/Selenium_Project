package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

}
