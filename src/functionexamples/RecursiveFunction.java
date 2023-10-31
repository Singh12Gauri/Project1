package functionexamples;

//Write a program using recursion function find factorial of the number

public class RecursiveFunction {
	
	// Recursive method: A method which is calling itself is known as recursive method. 
	
	static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int number=6;
		fact=factorial(number);
		System.out.println("Factorial of number is "+fact);
	}
}
