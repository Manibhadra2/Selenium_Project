package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		search.submit();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		allWindowId.remove(parentId);
		for(String windowId:allWindowId)
		{
			driver.switchTo().window(windowId);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			
		}
			
	}

}
