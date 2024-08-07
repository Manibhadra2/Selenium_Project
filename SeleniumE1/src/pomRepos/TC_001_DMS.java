package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_DMS  {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmaillink().sendKeys("jintu@gamil.com");
		lp.getPasswordLink().sendKeys("jintu@122");
		lp.getLoginButton().click();
		
		
		
		
		
	}

}
