package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScrrenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;

		File temp = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./ErrorMsg/Flipkart1.png");

		org.openqa.selenium.io.FileHandler.copy(temp, dest);
		driver.quit();

	}

}
