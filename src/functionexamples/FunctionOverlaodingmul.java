package functionexamples;

//Write a program using method over loading to do multiplication of numbers with different data types

public class FunctionOverlaodingmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverlaodingmul f=new FunctionOverlaodingmul ();
		f.mul(70,5);
		f.mul(3.5,70);
		
	}
	void mul(int x, int y)
	{
		int multiple=x*y;
		System.out.println("Multiplication of two nos are " +multiple);
	}
	double mul(double x, int y)
	{
		double multiple=x*y;
		System.out.println("Multiplication of two nos are " +multiple);
		return (multiple);
	}
}
