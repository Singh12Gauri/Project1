package functionexamples;

 class adds
{
	void add(int x, int y)
	{
		int add=x+y;
		System.out.println("Addition of no "+ add);
	}
}
class multiplication extends adds
{
	void mul(int x, int y)
	{
		int mul=x*y;
		System.out.println("Multiplication of nos "+mul);
	}
}

 class MultilevelInheritance extends multiplication {
	void div(int x , int y)
	{
		int div=x/y;
		System.out.println("Division of two nos "+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultilevelInheritance obj =new MultilevelInheritance();
		obj.add(20 , 30);
		obj.mul(60,45);
		obj.div(69 ,7);
	}

}
