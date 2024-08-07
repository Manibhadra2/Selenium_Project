package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		
		for(;;) {
		try {
			driver.findElement(By.xpath("//img[@id='dimg_377']")).click();
			break;
			
			
		} catch (Exception e) {
			j.executeScript("window.scrollBy(0,500);");
		}
	
	} 
	}

}
