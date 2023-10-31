package exceptionhandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x[]=new int[5];
			x[9]=10/0;
			}
		catch(Exception e)
		{
			System.out.println("Exception block");
		}
	}

}
