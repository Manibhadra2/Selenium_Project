package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
   @Test
     public void createAccount()
    {
	   Reporter.log("Account created successfully",true);
	}
   
   @Test(dependsOnMethods ="createAccount")
   public void editeAccount()
    {
	   Reporter.log("Account edited successfully",true);
	}
   
    @Test(dependsOnMethods = {"editeAccount","createAccount"})
    public void deleteAccount()
    {
	   Reporter.log("Account deleted successfully",true);
	}
}
