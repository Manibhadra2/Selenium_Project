package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionidGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();
         System.out.println(sessionId);
	}

}
