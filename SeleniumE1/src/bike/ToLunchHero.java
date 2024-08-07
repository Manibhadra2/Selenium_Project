package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchHero {

	@Test(groups = "smoke")
	public void Hero()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
		Reporter.log("hero got open",true);
		driver.quit();
	}
}
