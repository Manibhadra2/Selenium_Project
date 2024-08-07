package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiSelect = driver.findElement(By.id("cars"));
		
		
		Select s=new Select(multiSelect);
		System.out.println(s.isMultiple());
		
		
		s.selectByIndex(0);
		s.selectByValue("99");
		s.selectByVisibleText("199");
		Thread.sleep(3000);
		
        s.deselectByIndex(0);
        s.deselectByValue("99");
        s.deselectByVisibleText("199");
		
	}

}
