package navigate_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Interface_ToString_Method {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
}
}
