package myOwnPraticeOfSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import takeScreenShot.GetScreenShotAs;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
     	WebDriver driver=new ChromeDriver();
     	
		TakesScreenshot t=(TakesScreenshot)driver;
//		File temp = t.getScreenshotAs(OutputType.FILE);
//		File src=new File("./knjdj/jdj.jpeg");            //entire webpage
//		FileHandler.copy(temp, src);
		
		
		
		
		
		

	}

}
