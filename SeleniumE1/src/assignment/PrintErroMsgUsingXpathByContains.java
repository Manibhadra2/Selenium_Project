package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintErroMsgUsingXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		String Error = driver.findElement(By.xpath("//span[contains(text(),'First')]")).getText();
		System.out.println(Error);
		String Error1 = driver.findElement(By.xpath("//span[contains(text(),'Last')]")).getTagName();
		System.out.println(Error1);
	}

}
