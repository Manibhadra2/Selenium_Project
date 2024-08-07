package advanceSeleniumE1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWT_002 extends BaseClass {
	String expectedData="Computers";
   @Test
   public void clickComputer()
  {
	driver.findElement(By.partialLinkText("Computers")).click();
	String actualdata = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
	/*if(expectedData.equals(actualdata))
	{
		Reporter.log("seccessfully navigate computer page",true);
	}
	else {
		Reporter.log("not able to navigate computer page",true);
	}*/
	Assert.assertEquals(actualdata,expectedData,"error is coming");
	
		Reporter.log("computer got open",true);
		driver.quit();
  }
}
