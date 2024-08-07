package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchKawasaki {
	@Test(groups = "Regression")
	public void KTM()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("Kawasaki got open",true);
		driver.quit();
	}
}
