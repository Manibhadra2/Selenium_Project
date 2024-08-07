package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight'][1]")).click();
	}

}
