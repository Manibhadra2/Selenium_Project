package advanceSeleniumE1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_DWS_001 extends BaseClass {

	String expectedD="Books";
	@Test
	public void Book()
	{
		String actualData = driver.findElement(By.partialLinkText("Books")).getText();
		Assert.assertEquals(expectedD,actualData,"errormsg");
		
		Reporter.log("book page got open",true);
	}
	
	
}
