package exceptionhandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x[]=new int[5];
			x[9]=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic catch block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index catch block");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
			System.out.println("After exception");
			
		
	}
	}


