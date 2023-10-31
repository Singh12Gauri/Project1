package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(10);
	}
		static void validate(int age)
		{
			if(age<16)
			{
				throw new ArithmeticException("Not Eligible for class");
			}
			else
			{
				System.out.println("Eligible for the clas ");
		}
	}

}
