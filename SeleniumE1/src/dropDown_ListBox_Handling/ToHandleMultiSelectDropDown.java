package dropDown_ListBox_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapp.skillrary.com/");
		WebElement multiSelectionListbox = driver.findElement(By.id("cars"));
		
		//to handle
		Select multiselect=new Select(multiSelectionListbox);
        System.out.println(multiselect.isMultiple());
        //call method
        multiselect.selectByIndex(0);
        multiselect.selectByValue("99");
        multiselect.selectByValue("199");
        Thread.sleep(3000);
        
        
       //  to deselect
        multiselect.deselectByIndex(0);
        multiselect.deselectByValue("99");
       multiselect.deselectByValue("199");
	}

}
