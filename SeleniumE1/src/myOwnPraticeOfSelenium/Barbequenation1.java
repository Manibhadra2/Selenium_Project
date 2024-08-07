package myOwnPraticeOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Barbequenation1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.barbequenation.com/");
	Thread.sleep(2000);
	String sessionId = driver.getWindowHandle();
	System.out.println(sessionId);
	Thread.sleep(2000);
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	Thread.sleep(2000);
	  Dimension SizeOfarray = driver.manage().window().getSize();
	  System.out.println(SizeOfarray);
	  Thread.sleep(2000);
	  Point position = driver.manage().window().getPosition();
	  System.out.println(position);
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
}
}
