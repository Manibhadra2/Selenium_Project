package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
     
     driver.get("https://www.facebook.com/");
     Point lognBtn = driver.findElement(By.name("login")).getLocation();
     
     System.out.println(lognBtn.getX());
     System.out.println(lognBtn.getY());
	}

}
