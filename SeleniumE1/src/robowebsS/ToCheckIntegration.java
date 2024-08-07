package robowebsS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckIntegration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://49.249.28.218:8081/AppServer/Online_Shopping_Alphaware/index.php");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("manibhadra12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='photo/852236910hypervenom.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		

	}

}
