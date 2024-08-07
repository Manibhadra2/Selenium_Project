package myOwnPraticeOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://bskyportal.odisha.gov.in/#/login");
	d.findElement(By.id("userInput")).sendKeys("jintu");
	Thread.sleep(2000);
	d.findElement(By.id("inputPassword")).sendKeys("12345");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.findElement(By.id("loginBtn")).click();

	}

}
