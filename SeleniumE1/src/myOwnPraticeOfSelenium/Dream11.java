package myOwnPraticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dream11.com/");
	
	driver.switchTo().frame("send-sms-iframe");
	
}
}
