package myOwnPraticeOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeAutoSuggection {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	  Thread.sleep(2000);
	   List<WebElement> sug = driver.findElements(By.xpath("driver.findElement(By.id(\"twotabsearchtextbox\"))"));
	   for(WebElement e:sug)
	   {
		   System.out.println(e.getText());
	   }
	}

}
