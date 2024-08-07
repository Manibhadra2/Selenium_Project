package advanceSeleniumE1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;

	@Parameters("broswer")
	@BeforeClass
	public void toLunch(@Optional("edge") String bname) {
		if (bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (bname.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}
		else if (bname.equalsIgnoreCase("explore")) {
			driver=new InternetExplorerDriver();
		}

		
		Reporter.log("broswer got open successfully", true);
		driver.manage().window().maximize();
		Reporter.log("broswer got maximize successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("navigated successfully to home page", true);

	}

	@Test
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logged out seccessfully", true);
	}

	public void closetheBroswer() {
		Reporter.log("broswer got close successfully", true);
		driver.quit();
	}
}

