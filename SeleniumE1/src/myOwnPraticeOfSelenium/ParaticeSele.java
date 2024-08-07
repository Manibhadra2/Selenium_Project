package myOwnPraticeOfSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaticeSele {

	public static void main(String[] args) throws MalformedURLException  {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//webdriver method
		d.get("https://demowebshop.tricentis.com/");
		String tittle = d.getTitle();
		String windid = d.getWindowHandle();
		Set<String> ids = d.getWindowHandles();
		d.close();
		d.quit();
		String pages = d.getPageSource();
		String curl = d.getCurrentUrl();
		d.manage().window().maximize();
		d.manage().window().minimize();
		Dimension gs = d.manage().window().getSize();
		
		d.manage().window().getPosition();
		d.manage().window().setPosition(new Point(6, 8));
		d.navigate().forward();
		d.navigate().back();
		d.navigate().refresh();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.navigate().to(new URL("https://demowebshop.tricentis.com/"));
		
		
		
		
		
		
		
		
		
		
		//SearchContext method
		WebElement fi = d.findElement(By.id("jkhd"));
		List<WebElement> fies = d.findElements(By.id("kjjhbbhj"));
		
		//By is an abstract class it provider 8 static method
		
		
		

	}

}
