package testNgxample;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=1,description="This is login")
	public void bloginTest()
	{
		System.out.println("Login created sucessfully");
	}
	
	@Test(priority=2,description="This is logout")
	public void alogoutTest()
	{
		System.out.println("Logout created sucessfully");
	}
	
	@Test
	public void homepage()
	{
		System.out.println("User is on the home page ");
	}
}
