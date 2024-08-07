package task1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Barbequenation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.barbequenation.com/");
		Thread.sleep(2000);
          String sessionId = driver.getWindowHandle();
          System.out.println(sessionId);
         
		Thread.sleep(2000);
          String curnUrl = driver.getCurrentUrl();
          System.out.println(curnUrl);
  		Thread.sleep(2000);

             Dimension size = driver.manage().window().getSize();
             System.out.println(size);
             Thread.sleep(2000);
               Point positionOfUrl = driver.manage().window().getPosition();
               System.out.println(positionOfUrl);
       		Thread.sleep(2000);

               driver.quit();
          
	}

}
