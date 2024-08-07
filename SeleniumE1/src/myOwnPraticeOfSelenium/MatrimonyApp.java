package myOwnPraticeOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class MatrimonyApp {
 public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.oriyamatrimony.com/");
	Thread.sleep(5000);
	    Dimension myApplicationSize = driver.manage().window().getSize();
	    System.out.println(myApplicationSize);
	    Thread.sleep(2000);
	   driver.manage().window().setSize( new Dimension(123, 344));
	   Thread.sleep(2000);
	   driver.quit();
}


}

