package javaexamples;
interface interface1
{
	void m1();
	int x=90;
}

public class InterfaceExample implements interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj=new InterfaceExample();
		obj.m1();
	}
	public void m1()
	{
		System.out.println("M1 code");
	}

}
