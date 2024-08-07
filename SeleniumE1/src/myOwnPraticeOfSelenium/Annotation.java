package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	ChromeDriver d;
	@BeforeSuite
	public void SetofClass() {
		 d=new ChromeDriver();
		Reporter.log("Browser got open", true);
	}
	@BeforeTest
	public void BT() {
		d.manage().window().maximize();
		Reporter.log("Browser got Maximize",true);
	}
	
	@BeforeClass
	public void BC() {
			d.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void BM() {
		d.findElement(By.linkText("Register")).click();
	}

		
	@AfterMethod
	public void AM() {
		d.findElement(By.id("FirstName")).sendKeys("7576");
		Reporter.log("Successfully pass");
	}
	@AfterClass
	public void AC() {
		d.findElement(By.id("LastName")).sendKeys("hggh");
		Reporter.log("Successfully pass");
	}
	
	
	@AfterTest
	public void AT() {
		d.findElement(By.id("LastName")).sendKeys("hjghjasg@guhgd");
		Reporter.log("Successfully pass");
	}
	@AfterSuite
	public void AS() {
		d.quit();
		Reporter.log("Successfully close");
	}
	

	

}
