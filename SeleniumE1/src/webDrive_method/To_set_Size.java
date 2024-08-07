package webDrive_method;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class To_set_Size {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(500, 80));
        }

}
