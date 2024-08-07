package mypratice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");//
		String t = d.getTitle();
		String winis = d.getWindowHandle();
		System.out.println(winis);
		 Set<String> alwinid = d.getWindowHandles();
		 System.out.println(alwinid);
	
		String pages = d.getPageSource();
		System.out.println(pages);
		
		
		String ur = d.getCurrentUrl();
		System.out.println(ur);
		
		 d.manage().window().maximize();
		d.manage().window().minimize();
		Point po = d.manage().window().getPosition();
		System.out.println(po);
	 d.manage().window().setPosition(new Point(83,84));
		d.navigate().forward();
		d.navigate().back();
		d.navigate().refresh();
		//d.navigate().to("https://demowebshop.tricentis.com/");
		d.navigate().to(new URL("https://demowebshop.tricentis.com/"));
		d.close();
		d.quit();

	}

}
