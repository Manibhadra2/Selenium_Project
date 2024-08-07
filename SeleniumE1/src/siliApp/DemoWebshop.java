package siliApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebshop {
 
	@Test
	public void DemoWeb() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("demowebshop got executed",true);
		WebElement loginB = driver.findElement(By.xpath("//a[text()='Log in']"));
		loginB.click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("736367@837");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("9877hfhh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
