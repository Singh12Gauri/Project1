package exceptionhandling;

public class Finallyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=10/1;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block code to hand exception");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
			System.out.println("After exception");
			
		
	}

}
