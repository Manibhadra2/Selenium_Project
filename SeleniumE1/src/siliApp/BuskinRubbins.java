package siliApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BuskinRubbins {

	@Test
	public void BuskinRabins() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(2000);
		Reporter.log("BuskinRabins got executed",true);
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement emai = driver.findElement(By.id("Email"));
		emai.sendKeys("Jintu@2002");
		driver.findElement(By.xpath("//button[@name='commit'][1]")).click();
	}
}
