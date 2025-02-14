package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
         driver.switchTo().frame("iframeResult");
         driver.findElement(By.xpath("//button[text()='Try it']")).click();
         Alert prom = driver.switchTo().alert();
         prom.sendKeys("chintu");
         prom.accept();
	}

}
