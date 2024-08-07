package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.makemytrip.com/");
		d.findElement(By.xpath("(//span[@class='headerIconWrapper'])[2]")).click();
		JavascriptExecutor j=(JavascriptExecutor)d;
		for(;;) {
		try {
		d.findElement(By.xpath("//img[@alt='ibis Styles Goa Calangute - An Accor Brand']")).click();
		}
		catch (Exception e) {
			j.executeScript("scrollBy(0,200);");
		}
		
	}
	}

}
