package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_Independent_Xpath_XpathBySurrounding {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(75));
		
		driver.findElement(By.id("loginBtn")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.id("Email")).sendKeys("manibhadrabehera69@gmail.com");
         
         driver.findElement(By.id("Password")).sendKeys("Mani@123");
         
         driver.findElement(By.xpath("//span[text()='Login']")).click();
          Thread.sleep(2000);
         
         driver.findElement(By.id("men")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//span[text()='levis']/../../..//button[text()='add to cart']")).click();
	}

}



//span[text()='levis']/../../..//button[text()='add to cart']

