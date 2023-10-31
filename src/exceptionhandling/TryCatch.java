package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block code to hand exception");
		
		}
	System.out.println("After exception");
	
}
	}


