package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Point loactonOfweb = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
	System.out.println(loactonOfweb);
     System.out.println(loactonOfweb.getX());
     System.out.println(loactonOfweb.getY());
	}

}
