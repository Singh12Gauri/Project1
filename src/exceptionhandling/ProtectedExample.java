package exceptionhandling;

public class ProtectedExample {

	protected int x,y;
	protected void divison(int x, int y)
	{
		int div=x/y;
		System.out.println(""+div);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedExample obj=new ProtectedExample();
		    obj.divison(690,22);
	}
	
	}

