package functionexamples;

public class MulTwoNoFunctionParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulTwoNoFunctionParameter m=new MulTwoNoFunctionParameter();
		m.multiply(23,78);
	}
	void multiply(int x,int y)
	{
		int z=x*y;
		System.out.println("Multiplication of two nos are "+z);
	}
}
