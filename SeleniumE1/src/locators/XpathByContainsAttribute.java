package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(5000);
	String errorMsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
    System.out.println(errorMsg);
	}

}
