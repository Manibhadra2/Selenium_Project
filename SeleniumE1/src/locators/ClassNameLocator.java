package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.instagram.com/accounts/login/");
//		Thread.sleep(2000);
//		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("uyiuuhakjh8727");
        driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(6000);
		driver.findElement(By.className("email")).sendKeys("mani@123");
	}

}
