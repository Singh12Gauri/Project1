package functionexamples;

 class A
{
	 
	 void add(int x , int y)
	 {
		 int add=x+y;
		 System.out.println("Sum of the given nos are :" +add);
	 }
}
 public class Overridding extends A
 {
	 void add(int x, int y)
	 
	 {
		 //When invoking a superclass version of an overridden method the super keyword is used.
		 super.add(20,40);
		 int add= x+y;
		 System.out.println("The sum of two nos are :" +add);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridding obj=new Overridding();
		obj.add(24,34);
	}

}
