package exceptionhandling;

public class PublicExample {

	public int x, y;
	
		public void mul(int x, int y)
		{
			int mul=x*y;
			System.out.println("Multiplication of two nos are: "+mul);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicExample obj=new PublicExample();
		obj.mul(45,98);
	}

}
