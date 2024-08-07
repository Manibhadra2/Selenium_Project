package task1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class NavigatePolarBearApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://polarbear.co.in/");
		Thread.sleep(2000);
          String title = driver.getTitle();
          System.out.println(title);
          driver.close();
	}

}
