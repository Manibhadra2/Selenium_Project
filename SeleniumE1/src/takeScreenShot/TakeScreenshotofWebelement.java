package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotofWebelement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File temp3 = driver.findElement(By.xpath("(//a[@class='nivo-imageLink'])[1]")).getScreenshotAs(OutputType.FILE);
         File dest=new File("./ErrorMsg/Element1.jpeg");
         FileHandler.copy(temp3, dest);
	}

}
