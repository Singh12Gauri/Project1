package exceptionhandling;

public class DefaultExample {

	 void sub(int x ,int y) //If you don't use any modifier, it is treated as default by default. 
	{
		int sub=x-y;
		System.out.println("Difference of two nos are : "+sub);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultExample obj=new DefaultExample();
			obj.sub(45 , 34);
	}

}



