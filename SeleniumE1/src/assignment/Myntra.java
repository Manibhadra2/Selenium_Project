package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/myntra-fashion-store");
		Thread.sleep(2000);
		//driver.findElement(By.className("desktop-main")).click();
		driver.findElement(By.linkText("Men")).click();

	}

}
