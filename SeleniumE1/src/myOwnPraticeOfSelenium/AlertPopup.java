package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.findElement(By.linkText("CONTINUE")).click();
        
        driver.switchTo().frame("login_page");
        driver.findElement(By.linkText("CONTINUE")).click();
        driver.switchTo().parentFrame();
        
       //to handle popup
       Alert toHandle = driver.switchTo().alert();
       toHandle.accept();
	}

}
