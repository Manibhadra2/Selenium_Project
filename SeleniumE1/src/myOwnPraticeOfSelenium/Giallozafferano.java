package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Giallozafferano {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("SeleniumE1@gmail.co");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		String erm = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(erm);
		
//		 String email = driver.findElement(By.id("Email")).getText();
//		 System.out.println(email);
		
//		 Point email = driver.findElement(By.id("Email")).getLocation();
//	
//		System.out.println(email.getX());
//		System.out.println(email.getY());
//		System.out.println(email.getClass());
		
		
//		Rectangle email = driver.findElement(By.id("Email")).getRect();
//		System.out.println(email.getWidth());
//		System.out.println(email.getHeight());
//		System.out.println(email.getX());
//		System.out.println(email.getY());
//		System.out.println(email.getPoint());
//		System.out.println(email.getDimension());
//		System.out.println(email.getClass());
		
		
//		System.out.println(email.getCssValue("background"));
//		System.out.println(email.getTagName());
		
		
//		System.out.println(email.getAttribute("data-val-email"));
	}

}
