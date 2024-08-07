package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchRoyalInfield {
     
	@Test(groups = "smoke")
	public void KTM()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got open",true);
		driver.quit();
	}

}
