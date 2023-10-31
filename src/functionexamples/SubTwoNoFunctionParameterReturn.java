package functionexamples;

public class SubTwoNoFunctionParameterReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTwoNoFunctionParameterReturn obj=new SubTwoNoFunctionParameterReturn();
		int diff = obj.sub(667,489);
		System.out.println("Subtraction of two nos are "+diff);
	}
	int sub(int a, int b)
	{
		int c=a-b;
		return(c);
	}
}
