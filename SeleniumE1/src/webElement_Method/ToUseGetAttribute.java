package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
         WebElement tryfreeButton = driver.findElement(By.linkText("Try Free"));
         System.out.println(tryfreeButton.getAttribute("class"));
	}

}
