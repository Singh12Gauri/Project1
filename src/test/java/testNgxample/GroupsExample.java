package testNgxample;

import org.testng.annotations.Test;

@Test(groups="user-registration")
public class GroupsExample {

	
	@Test(priority=1,groups="regression")
	public void aTest1()
	{
		System.out.println("Test 1 code ");
	}
	
	@Test(priority=2,groups="regression")
	public void bTest2()
	{
		System.out.println("Test 2 code ");
	}
	
	@Test(groups={"regression","bvt"})
	public void bTest3()
	{
		System.out.println("Test 3 code ");
	}
	
	@Test(groups="bvt")
	public void aTest4()
	{
		System.out.println("Test 4 code ");
	}
}
