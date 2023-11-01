package testNgxample;

import org.testng.annotations.Test;

public class DependsOnMethodsEx {

	@Test(dependsOnMethods="Testcase2")      //This means testcase 1 is depended on testcase 2
	public void Testcase1() {
		System.out.println("Code for test case 1 ");
	}
	
	@Test
	public void Testcase2() {
		System.out.println("Code for test case 2");
	}
}
