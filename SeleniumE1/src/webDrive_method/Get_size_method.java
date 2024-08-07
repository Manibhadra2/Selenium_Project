package webDrive_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_size_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		

               Thread.sleep(2000);

		driver.manage().window().fullscreen();
         //to get the size
         Dimension sizeOfBrowser = driver.manage().window().getSize();
            System.out.println(sizeOfBrowser);
	}

}
