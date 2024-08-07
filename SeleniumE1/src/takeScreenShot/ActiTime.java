package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File src=new File("./ErrorMsg/W3s.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp1, src);
		

	}

}
