package javaexamples;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,a=0, b=0,c=1;
				for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println("Fibonacci series of the number :" +a);
					
			
		}
	}

}
