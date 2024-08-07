package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect_Method {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		Thread.sleep(2000);
		System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
        System.out.println(rect.getX());
        System.out.println(rect.getY());
	}

}
