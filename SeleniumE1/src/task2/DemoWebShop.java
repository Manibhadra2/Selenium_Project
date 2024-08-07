package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).sendKeys("mail");
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Chintu");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("behera");
        Thread.sleep(2000);
        driver.findElement(By.name("Email")).sendKeys("manibhadrabehera.in@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("Password")).sendKeys("864594");
        Thread.sleep(2000);
        driver.findElement(By.name("ConfirmPassword")).sendKeys("864594");
        Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();
        
	}

}
