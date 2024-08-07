package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Chintu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("2342");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
