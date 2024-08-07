package synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitywait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
	}

}
