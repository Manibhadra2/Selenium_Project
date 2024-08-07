package pup_up;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToavoidFileUploadedpopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAjw7-SvBhB6EiwAwYdCAXgxFJv3SU6GriGbBtM26jgqWENQ0tc-mlrfj72k7n-mIixsIzyEtBoCKW8QAvD_BwE&gclsrc=aw.ds");
        //to use action class
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		  driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\manib\\OneDrive\\Documents\\Manibhadra.docx");
		
	}

}
