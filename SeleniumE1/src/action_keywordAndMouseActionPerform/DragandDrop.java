package action_keywordAndMouseActionPerform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		//identify images
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		
         WebElement image1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
         WebElement image2 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
         WebElement image3 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
         WebElement image4 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
          
        WebElement trase = driver.findElement(By.id("trash"));
         
        Actions action=new Actions(driver);
        action.dragAndDrop(image1, trase).perform();
        Thread.sleep(3000);
        action.dragAndDrop(image2, trase).perform();
        Thread.sleep(3000);
        action.dragAndDrop(image3, trase).perform();
        Thread.sleep(3000);
        action.dragAndDrop(image4, trase).perform();
        
        Thread.sleep(3000);
        
         WebElement gallery = driver.findElement(By.id("gallery"));
         action.dragAndDrop(image1, gallery).perform();
         Thread.sleep(2000);
         action.dragAndDrop(image2, gallery).perform();
         Thread.sleep(2000);
         action.dragAndDrop(image3, gallery).perform();
         Thread.sleep(2000);
         action.dragAndDrop(image4,gallery).perform();
         
         
         
         //drag and drop By
         //action.dragAndDropBy(image1, 400, 0).perform();
         //action.clickAndHold(image3).moveToElement(gallery).release().perform();
	}

}
