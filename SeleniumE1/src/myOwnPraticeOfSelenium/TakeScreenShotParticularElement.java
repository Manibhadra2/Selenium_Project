package myOwnPraticeOfSelenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotParticularElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Jewelry")).click();
		d.findElement(By.xpath("//img[@alt='Picture of Create Your Own Jewelry']")).click();
		TakesScreenshot t=(TakesScreenshot)d;
		File temp = d.findElement(By.xpath("//img[@alt='Picture of Create Your Own Jewelry']")).getScreenshotAs(OutputType.FILE);
		File src= new File("./ErrorMsg/Jewelry1.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);
	}

}
