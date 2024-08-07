package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create obj of fileinputString
		FileInputStream fs=new FileInputStream("./testData/TextDataE1.xlsx");
		
		//create obj of respective file type
		
		Workbook wb=WorkbookFactory.create(fs);
		
		
		//call the method
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
	    String lastName = wb.getSheet("sheet1").getRow(3).getCell(0).toString();
        String gmail = wb.getSheet("sheet1").getRow(4).getCell(0).toString();
		String password = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
        String conPasswo = wb.getSheet("sheet1").getRow(5).getCell(0).toString();
        
        
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4	));
		driver.get(URL);
		driver.findElement(By.id("FirstName")).sendKeys(USERNAME);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(gmail);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conPasswo);
	}

}
