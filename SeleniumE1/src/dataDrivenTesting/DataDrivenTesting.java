package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	

	public static void main(String[] args) throws IOException {
		//create obj of fileInputString
		FileInputStream fis=new FileInputStream("./testData/testData.properties");
		
		
		
		//create obj of respective file type
		Properties prop=new Properties();
		
		
		//call method
		prop.load(fis);
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("FirstName");
		String PASSWORD = prop.getProperty("password");

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.id("FirstName")).sendKeys(USERNAME);
		driver.findElement(By.id("LastName")).sendKeys(PASSWORD);

	}

}
