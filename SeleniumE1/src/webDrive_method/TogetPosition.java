package webDrive_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetPosition {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
       
         Thread.sleep(2000);
        Point pos=driver.manage().window().getPosition();
         System.out.println(pos);
	}

}
