package apps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test(groups = "function")
  public void ToopenFlipkart()
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Reporter.log("flipkart got open",true);
	  driver.quit();
   }
  
}
