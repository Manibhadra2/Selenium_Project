package apps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
	@Test(groups = "function")
	public void Myntra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Reporter.log("myntra got open", true);
		driver.quit();
	}
}
