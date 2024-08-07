package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
  		//to manage iframe using index
    	//driver.switchTo().frame(0);
		
		
		
        //to handle iframe using string id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		
		
		//to handle using webElement
       	WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7325930472");
		
		
		//switch back to the parent we have 2 method
	//	.....................................................
		
		Thread.sleep(2000);
	
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
     	driver.findElement(By.linkText("About Us")).click();
     	Thread.sleep(2000);
 
	}

}
