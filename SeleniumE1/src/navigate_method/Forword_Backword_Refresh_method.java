package navigate_method;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forword_Backword_Refresh_method {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	Navigation nav=driver.navigate();
	nav.back();
	Thread.sleep(2000);
	nav.forward();
	Thread.sleep(2000);
	nav.refresh();
}
}
