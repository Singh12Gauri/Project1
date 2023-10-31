package functionexamples;

//Write a program using method overloading to do subtraction different data types

public class FunctionOverloading {

	//Method overloading is having same name but different parameters 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading f=new FunctionOverloading();
		f.sub(220.90, 80);
		f.sub(100, 20);
	}

	void sub(int x, int y)
	{
		int sub=x-y;
		System.out.println("Subtraction of two integers are "+sub);
	}
	void sub(double x, int y)
	{
		double sub=x-y;
		System.out.println("Subtraction of one double and one integers are "+sub);
	}
	
}
	
