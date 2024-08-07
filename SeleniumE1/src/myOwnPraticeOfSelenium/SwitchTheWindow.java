package myOwnPraticeOfSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTheWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.turtlemint.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.findElement(By.xpath("(//span[@class='icon tm-hover'])[1] ")).click();
		Set<String> allwindowId = driver.getWindowHandles();
		allwindowId.remove(parentId);
		for (String windowId : allwindowId) {
			
			driver.switchTo().window(windowId);
			driver.findElement(By.name("registrationNo")).sendKeys("OD29C2355");
			Thread.sleep(2000);
//			driver.findElement(By.id("registrationDate-datepicker")).sendKeys("10/03/2025");
			driver.findElement(By.id("container-next-btn")).click();
			Thread.sleep(2000);
		
		}
	}

}
