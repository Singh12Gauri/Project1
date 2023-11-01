package testNgxample;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestExample {

	@Test (enabled=false)
	public void skipTest1() {
		System.out.println("Skipping this test case as it is not completed");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test case forcefully");
		throw new SkipException("Skipping this Test");
	}
	
	Boolean datasetup=false;
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test case based on condition");
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not excute further steps");
			throw new SkipException("Do not excute further steps");
		}
	}
	
	
}
