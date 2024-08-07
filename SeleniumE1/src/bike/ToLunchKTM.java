package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchKTM {
	@Test(groups = "Regression")
	public void KTM() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got open",true);
		Thread.sleep(2000);
		driver.quit();
	}
}
