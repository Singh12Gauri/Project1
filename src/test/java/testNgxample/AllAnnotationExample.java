package testNgxample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationExample  {

	
	@BeforeTest
	void LoginApplication()
	{
		System.out.println("Login to application");
	}
	
	@AfterTest
	void LogoutApplication()
	{
		System.out.println("Logout from application");
	}
	
	@BeforeMethod
	void ConnectedDB()
	{
		System.out.println("Application connected to DB ");
	}
	
	@AfterMethod
	void DisconnectedDB()
	{
		System.out.println("Dissconnect the application from DB");
	}
	@Test
	void Test1()
	{
		System.out.println("Test 1 code ");
	}
	
	@Test
	void Test2()
	{
		System.out.println("Test 2 code ");
	}
	
	@BeforeClass
	void ApplicationURL()
	{
		System.out.println("Apllication URL has been given ");
	}
	
	@AfterClass
	void CloseApplication()
	{
		System.out.println("Close the application");
	}
	
	@BeforeGroups
	void RegressionGroup()
	{
		System.out.println("Before the Regression Group");
	}
	
	@AfterGroups
	void RegressionGroup1()
	{
		System.out.println("After the Regression Group");
	}
	
	@BeforeSuite
	void RegressionSuite()
	{
		System.out.println("Before the Regression Suite");
	}
	
	@AfterSuite
	void RegressionSuite1()
	{
		System.out.println("After the Regression Suite");
	}
}
