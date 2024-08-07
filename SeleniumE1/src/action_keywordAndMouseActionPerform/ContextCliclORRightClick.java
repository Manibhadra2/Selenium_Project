package action_keywordAndMouseActionPerform;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextCliclORRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		Actions action=new Actions(driver);
		Thread.sleep(2000);
        action.contextClick().perform();
	}
}
