package navigate_method;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUrl_Url_method {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to(new URL("https://www.turtlemint.com/"));
         String parenId = driver.getWindowHandle();
         driver.findElement(By.xpath("(//i[@class='tm-sprite-10 bg-bike'])[1]")).click();
         Thread.sleep(2000);
         
         Set<String> windowId = driver.getWindowHandles();
         for (String allId : windowId) {
			if(!(allId.equalsIgnoreCase(parenId)))
			{
				driver.switchTo().window(allId);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='registrationNo']")).sendKeys("OD29C2355");
				
			}
		}
        
	}

}
