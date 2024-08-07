package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
        //to manimize my Application
         
         Thread.sleep(2000);
         driver.manage().window().minimize();

	}

}
