package dropDown_ListBox_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		//to locate dropdown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
        
		//to handle drop down
		Select daySelect=new Select(dayDropdown);
		Select monthSelect=new Select(monthDropdown);
		Select yearSelect=new Select(yearDropdown);
		
		//call the method
		daySelect.selectByIndex(8);
		monthSelect.selectByValue("5");
		yearSelect.selectByVisibleText("1994");
		System.out.println(daySelect.isMultiple());
		System.out.println(monthSelect.isMultiple());
		
		//to check whether it is a single multiple
		//System.out.println(daySelect.isMultiple());
		 
		List<WebElement> allMonths = monthSelect.getOptions();
		for(WebElement month:allMonths)
		{
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(2000);
		}
		  
	}

}
