package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///D:/movie.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[text()='leo']/following-sibling::td")).click();
	Thread.sleep(2000);
}
}
