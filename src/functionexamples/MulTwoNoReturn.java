package functionexamples;

public class MulTwoNoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulTwoNoReturn obj = new MulTwoNoReturn();
		int mul = obj.multiply(43,67);
		System.out.println("Multiplication of two nos are "+mul);
	}
	int multiply(int x, int y)
	{
		int z=x*y;
		return(z);
	}
}
