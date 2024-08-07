package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_DMS  {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage w2=new WelcomePage(driver);
		w2.getRegister().click();
		
		ResisterPage r=new ResisterPage(driver);
		r.getGenderF().click();
		r.getFirstname().sendKeys("maniBhadra");
		r.getLastname().sendKeys("behera");
		r.getEmail().sendKeys("mani@12i748");
		r.getPass().sendKeys("8465w7hdgd8w");
		r.getConPass().sendKeys("8465w7hdgd8w");
		r.getRegiButon().click();
		
	}
}
