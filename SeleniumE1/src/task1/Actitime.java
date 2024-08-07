package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("romain Rings");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("yo yo sing");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Surya@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("wipro");


	}

}
