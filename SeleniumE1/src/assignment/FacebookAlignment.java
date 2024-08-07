package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAlignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
        int x1 = driver.findElement(By.id("email")).getLocation().getX();
        System.out.println(x1);
       int x2 = driver.findElement(By.id("passContainer")).getLocation().getY();
       System.out.println(x2);
       if(x1==x2)
       {
    	   System.out.println("properly aligned");
       }
       else System.out.println("not a aligned");
	}

}
