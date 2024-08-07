package webDrive_method;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
         Thread.sleep(2000);
         //driver.get("https://www.amazon.in/");
          //  String seccionId = driver.getWindowHandle();
          //  System.out.println(seccionId);
             Set<String> seccionId2 = driver.getWindowHandles();
          System.out.println( seccionId2);
	    }
   }
