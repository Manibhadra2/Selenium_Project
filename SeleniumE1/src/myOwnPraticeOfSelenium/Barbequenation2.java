package myOwnPraticeOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Barbequenation2 {

	private static final Dimension dimension = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);
		Thread.sleep(2000);
		String urlOfTheWebPage = driver.getCurrentUrl();
		System.out.println(urlOfTheWebPage);
		Thread.sleep(2000);
		Dimension sizeOf = driver.manage().window().getSize();
		System.out.println(sizeOf);
		Thread.sleep(2000);
		Point position = driver.manage().window().getPosition();
		System.out.println(position );
		Thread.sleep(2000);
		 driver.manage().window().setSize(new Dimension(5000, 98897) );
		
	}

}
