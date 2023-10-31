package javaexamples;

interface interface2
{
	void m1();
}
interface interface3
{
	void m2();
}

public class MultipleInheritance implements interface2, interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.m1();
		obj.m2();
	}
	public void m1()
	{
		System.out.println("Defination of m1 code ");
	}
	public void m2()
	{
		System.out.println("Defination of m2 code ");
	}

}
