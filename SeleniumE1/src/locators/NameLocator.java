package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://demowebshop.tricentis.com/register");
     Thread.sleep(2000);
     driver.findElement(By.name("Email")).sendKeys("hgkhj@123");
     Thread.sleep(2000);
     driver.findElement(By.name("Password")).sendKeys("6757");
	}

}
