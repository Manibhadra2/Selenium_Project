package myOwnPraticeOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMeth {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/mnjuser/homepage");
	 driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Dimension sizeofwindow = driver.manage().window().getSize();
	  System.out.println(sizeofwindow);
  }
		
	}



