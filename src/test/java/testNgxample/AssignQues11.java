package testNgxample;

//11.Write a program where 3 test cases are there in program and I don't want to execute 1 test case

import org.testng.SkipException;
import org.testng.annotations.Test;

public class AssignQues11 {
	
	@Test 
	public void testCase1() {
		System.out.println("Code for Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Code for Test case 2");
		throw new SkipException("Skip this test case as is it not completed");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Code for Test case 3");
	}
}
