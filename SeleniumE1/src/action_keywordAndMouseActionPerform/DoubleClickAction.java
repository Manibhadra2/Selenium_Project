package action_keywordAndMouseActionPerform;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		Thread.sleep(2000);
		WebElement actionbutton = driver.findElement(By.id("add"));
         Actions action1=new Actions(driver);
		action1.doubleClick(actionbutton).perform();
	}
}
