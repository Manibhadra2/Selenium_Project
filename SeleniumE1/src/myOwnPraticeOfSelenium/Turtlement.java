package myOwnPraticeOfSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Turtlement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.turtlemint.com/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='icon tm-hover'])[1]")).click();
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		allwindowId.remove(parentId);
		for (String WindowId : allwindowId) {
			driver.switchTo().window(WindowId);
			driver.findElement(By.name("registrationNo")).sendKeys("hjhjh9899878");	
			
		}
	}

}
