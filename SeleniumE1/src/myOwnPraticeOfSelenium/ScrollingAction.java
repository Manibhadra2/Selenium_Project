package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		
		dri.get("https://www.google.com/");
		
		Thread.sleep(5000);
	
		dri.findElement(By.id("APjFqb")).sendKeys("flower",Keys.ENTER);
		Thread.sleep(7000);
		dri.findElement(By.xpath("//span[text()='Images']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)dri;
		
		
		
		for(;;) {
		try {
			
			dri.findElement(By.xpath("//div[text()='11 Edible Flowers With Potential Health ...'][1]")).click();
            break;
			
		} catch (Exception e) {
		     js.executeScript("window.scrollBy(0,400)");
	}
	
		
	}

}
}
