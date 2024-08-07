package task1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class OliveGarden {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(200);
		driver.navigate().to("https://www.tripadvisor.in/Restaurant_Review-g297628-d7925626-Reviews-Olive_Garden-Bengaluru_Bangalore_District_Karnataka.html");
        Dimension SizeofWindow = driver.manage().window().getSize();
        System.out.println(SizeofWindow);
        driver.manage().window().setSize(new Dimension (500, 500));
        Thread.sleep(2000);
         driver.close();
	}

}
