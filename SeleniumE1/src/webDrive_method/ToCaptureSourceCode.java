package webDrive_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/jobs-in-bangalore");
        Thread.sleep(2000);
        String sourceCode = driver.getPageSource();
        System.out.println(sourceCode);
	}

}
