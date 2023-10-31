package javaexamples;

abstract class abc1
{
	abstract void m1();
}
public class AbstractExample extends abc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj=new AbstractExample();
		obj.m1();
	}

	
	void m1() {
		System.out.println("Code of m1");
		
	}

}
