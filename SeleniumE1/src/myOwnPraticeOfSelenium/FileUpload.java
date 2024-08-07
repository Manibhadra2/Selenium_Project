package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/upload-download");
		
       Actions a=new Actions(driver);
       a.sendKeys(Keys.PAGE_DOWN).perform();
       driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\manib\\OneDrive\\Desktop\\Education\\.docx");
       
       
       

	}

}
