package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.amazon.in/");
			
			Navigation navi = driver.navigate();
			
			navi.refresh();
			Thread.sleep(2000);
			navi.forward();
			navi.back();

	}

}
