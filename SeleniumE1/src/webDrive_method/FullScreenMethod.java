package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
        //to maximize my Application
          driver.manage().window().maximize();
         Thread.sleep(2000);
//         to minimize my screen
         driver.manage().window().minimize();
         //to full screen
         driver.manage().window().fullscreen();

	}

}
