package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_use_quit_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(0);
		driver.quit();
	}

}
