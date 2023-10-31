package functionexamples;

abstract class addition
{
	abstract void m1(int x, int y);
}
public class AbstractEx1 extends addition {
	void m1(int x, int y) {
		int add=x+y;
		System.out.println("Addition of two nos are " +add);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx1 obj=new AbstractEx1();
		obj.m1(23,34);
		
	}
 }

	





