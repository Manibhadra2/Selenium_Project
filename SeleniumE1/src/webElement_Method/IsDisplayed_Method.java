package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());	
		System.out.println("........................");
		Thread.sleep(2000);
		driver.findElement(By.className("username")).sendKeys("Chintu@123");
		driver.findElement(By.name("password")).sendKeys("12345");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
	}

}
