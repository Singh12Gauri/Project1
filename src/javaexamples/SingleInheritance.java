package javaexamples;
//This class is called as super / parent / base class
class Father
{
	void m1()
	{
		System.out.println("M1 code");
	}
}
// This class is called as sub / child / derived class 

public class SingleInheritance extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj=new SingleInheritance();
		obj.m1();
		obj.m2();
	}
	void m2()
	{ 
		System.out.println("M2 code");
	}

}
