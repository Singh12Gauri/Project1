package functionexamples;

final class Maths  // final class - If you declare any as a final class then we cannot extend that class
{
	
}
class Successor
{
	final int x =100; //final variable - it will become a constant and value of this variable cannot be changed in sub class
	final int y=60;
	final void add(int x, int y) // final method -  we cannot override that method
	{
		int add=x+y;
		System.out.println("Sum of two nos are :  "+add);
	}
}
public class Final extends Successor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final f=new Final();
		f.add(10,600);
	}

}
