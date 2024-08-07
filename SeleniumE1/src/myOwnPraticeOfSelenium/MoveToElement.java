package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.woodenstreet.com/home-decors");
		
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		dri.findElement(By.id("loginclose1")).click();
		
		
		
		
		WebElement kid = dri.findElement(By.linkText("Kids Room"));
        
		
		Actions a=new Actions(dri);
		
		
		
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		a.clickAndHold(kid).perform();
	}

}
