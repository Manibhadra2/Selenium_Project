package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpanText {

	public static void main(String[] args) throws InterruptedException {
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/login");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
      
	}

}
