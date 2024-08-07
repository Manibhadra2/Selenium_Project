package task1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
          driver.close();

	}

}
