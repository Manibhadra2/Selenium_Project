package pomRepos;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003_DMS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		ResisterPage r=new ResisterPage(driver);
		r.getResisterLink().click();
		r.getFirstname().sendKeys("mani");
		r.getLastname().sendKeys("hdhdg");
		r.getEmail().sendKeys("manibhadra7@mail.com");
		r.getPass().sendKeys("123456");
		r.getConPass().sendKeys("12345");
		Thread.sleep(2000);
		r.getRegiButon().click();
		String err = driver.findElement(By.xpath("//span[contains(text(),'password')]")).getText();
		System.out.println(err);
	}

}
