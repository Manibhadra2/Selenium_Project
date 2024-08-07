package takeScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeclareImplicitWait {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(190));
	 driver.get("https://www.instagram.com/");
	 driver.findElement(By.name("username")).sendKeys("Jintu");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	 driver.findElement(By.linkText("Log in")).click();
	}

}
