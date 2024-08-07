package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("search_query")).sendKeys("Natia Comedy");
        Thread.sleep(2000);
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Zombie || Trailer || Natia Comedy")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-title-no-tooltip='Full screen' ]")).click();
   }
}
