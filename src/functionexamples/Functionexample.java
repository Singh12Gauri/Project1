package functionexamples;
public class Functionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionexample obj=new Functionexample();
		int total = obj.add(10,20);
		System.out.println("Sum of two nos are " +total);
	}
	public int add(int x, int y)
	{
   
   int sum=x+y;
   return(sum);
	}
}
