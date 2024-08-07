package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("SeleniumE1@gmail.co");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		String erm = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(erm);

	}

}
