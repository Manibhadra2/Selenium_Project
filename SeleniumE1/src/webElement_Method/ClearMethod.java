package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("chintu");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("12334");
		driver.findElement(By.linkText("Sign in")).click();
		

	}

}
