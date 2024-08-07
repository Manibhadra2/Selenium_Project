package myOwnPraticeOfSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartParentwindow {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	   String parentId = driver.getWindowHandle();
	   WebElement searchBar = driver.findElement(By.name("q"));
	   searchBar.sendKeys("iphone");
	   searchBar.submit();
	   driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
	  Set<String> allWindowId = driver.getWindowHandles();
	  System.out.println(allWindowId);
	  for( String windowId:allWindowId )
	  {
		  driver.switchTo().window(windowId);
		  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	  }
	}

}
