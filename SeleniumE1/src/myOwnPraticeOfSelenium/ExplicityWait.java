package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));//impli
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(9));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("jmjgjh")));

	}

}
