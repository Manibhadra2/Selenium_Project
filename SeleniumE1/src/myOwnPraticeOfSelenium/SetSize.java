package myOwnPraticeOfSelenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().setSize(new Dimension(800,400));
	}

}
