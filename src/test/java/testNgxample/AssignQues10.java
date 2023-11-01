package testNgxample;

//10.     Write a program using @ Before method and @ After method

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignQues10 {

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
}
