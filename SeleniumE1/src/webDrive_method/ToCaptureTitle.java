package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) throws InterruptedException {
	   ChromeDriver driver=new ChromeDriver();
	   //driver.get("https://www.instagram.com/");
	   driver.get("https://www.instagram.com/");
       Thread.sleep(2000);
       String titleofwebpage = driver.getTitle();
       System.out.println(titleofwebpage);
	}

}
