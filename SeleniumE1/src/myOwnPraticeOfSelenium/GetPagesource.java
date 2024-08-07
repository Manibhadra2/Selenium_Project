package myOwnPraticeOfSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import takeScreenShot.GetScreenShotAs;

public class GetPagesource {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
		  
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			 File tem = ts.getScreenshotAs(OutputType.FILE);
			 File src = new File("./ErrorMsg/demo.jpeg");
			 FileHandler.copy(tem, src);
		
	}
	
	
	

}
