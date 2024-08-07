package dropDownHandleAssignMent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppQspider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Explore more")).click();
		Thread.sleep(4000);

		driver.findElement(By.linkText("Dropdown")).click();
		
		//to locate dropdown
		WebElement countryDroDown = driver.findElement(By.id("option20"));
		WebElement stateDropDown = driver.findElement(By.id("optionState"));
		//WebElement cityDropDown = driver.findElement(By.id("optionCity"));
		 
		
		
		//to handle dropdown
		Select daySelect=new Select(countryDroDown);
		Select StateSelect=new Select(stateDropDown);
		//Select citySelect=new Select(cityDropDown);
		
		
		
		//call the method
		daySelect.selectByVisibleText("Canada");
		StateSelect.selectByVisibleText("Odisha");
		//cityDropDown.sel
	}

}
