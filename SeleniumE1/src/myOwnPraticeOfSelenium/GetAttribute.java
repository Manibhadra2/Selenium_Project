package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.actitime.com/");
		  WebElement tryfreeBut = driver.findElement(By.linkText("Try Free"));
		  Thread.sleep(2000);
		  System.out.println(tryfreeBut.getAttribute("class"));

	}

}
