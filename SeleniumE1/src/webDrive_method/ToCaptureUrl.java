package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String urlName = driver.getCurrentUrl();
        System.out.println(urlName);
	}

}
