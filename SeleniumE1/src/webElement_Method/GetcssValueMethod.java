package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement tryfreeButton = driver.findElement(By.linkText("Try Free"));
		 Thread.sleep(8000);
		 System.out.println(tryfreeButton.getCssValue("max-width"));
		 System.out.println(tryfreeButton.getCssValue("background-color"));
	}
}
