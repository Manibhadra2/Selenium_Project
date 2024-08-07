package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority = 0,invocationCount  = 2)
	public void cricbuzz()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		Reporter.log("crickbuzz got executed",true);
		driver.quit();
	}
	@Test(priority = 1,invocationCount = 0)
	public void baskinRobbins() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got open",true);
		driver.quit();
	}
	@Test(priority = 4,invocationCount = 1)
	public void amazon()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got open",true);
		driver.quit();
	}
}


