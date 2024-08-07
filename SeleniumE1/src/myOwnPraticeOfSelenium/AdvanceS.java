package myOwnPraticeOfSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdvanceS {

	/*@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void AfterSuite()
	{
		Reporter.log("After Suite got executed", true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("before Test got executed", true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after test got executed", true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before class got executed", true);
	}
	@AfterClass
	public void Afterclass()
	{
		Reporter.log("After class got executed", true);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before Method got executed", true);
	}
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("after method got executed", true);
	}*/
	@Test(dependsOnMethods = "TestCase3")
	public void TestCase1()
	{
		Reporter.log("Testcase1 got execute",true);
	}
	@Test(dependsOnMethods = "TestCase1")
	public void TestCase2()
	{
		Reporter.log("Testcase2 got execute",true);
	}
	@Test
	public void TestCase3()
	{
		Reporter.log("Testcase3 got execute",true);
	}
}
