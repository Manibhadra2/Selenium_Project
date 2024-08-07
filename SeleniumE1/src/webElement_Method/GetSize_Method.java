package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
       Dimension getsize = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
       System.out.println(getsize);
       Thread.sleep(2000);
       System.out.println(getsize.getWidth());
       System.out.println(getsize.getHeight());
	}

}
