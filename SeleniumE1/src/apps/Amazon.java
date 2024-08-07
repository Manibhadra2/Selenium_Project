package apps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	
@Test(groups = "integration")
public void amazon()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Reporter.log("amazon got open",true);
	driver.quit();
}
}
