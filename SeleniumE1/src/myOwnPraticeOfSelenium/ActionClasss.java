package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		d.findElement(By.id("userName")).sendKeys("Jintu");
		d.findElement(By.id("password")).sendKeys("123456");
		WebElement showPa = d.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Thread.sleep(2000);
		Actions a=new Actions(d);
		a.clickAndHold(showPa).perform();
		Thread.sleep(9000);
		a.release().perform();

	}

}
