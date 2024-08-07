package webDrive_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_the_position {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
        
         Thread.sleep(2000);
         //to set the position
        driver.manage().window().setPosition(new Point(170, 50));
        
	}

}
