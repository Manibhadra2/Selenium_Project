package myOwnPraticeOfSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_PRIORITY {

	@Test( invocationCount = 2, threadPoolSize = 9)
	public void CreateAccount() {
		Reporter.log("account created", true);
	}
	
	@Test()
	public void DeleteAc() {
		Reporter.log("account deleted" ,true);
	}

}
