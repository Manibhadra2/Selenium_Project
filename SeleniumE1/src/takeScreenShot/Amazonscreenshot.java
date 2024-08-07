package takeScreenShot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazonscreenshot {

	public static void main(String[] args) throws IOException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File src=new File("./ErrorMsg/demowebshop.jpeg");
        FileHandler.copy(temp,src);	
	}

}
