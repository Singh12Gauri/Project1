package functionexamples;

class Inheritance
{
	void mul1(int x, int y)
	{
		int mul1 = x*y;
		System.out.println("Multiplicaion of the nos are " +mul1);
	}
}

public class SingleInheritanceEx extends Inheritance {
	
	void mul2(int x, int y)
	{
		int mul2 = x*y;
		System.out.println("Multiplicaion of the nos are " +mul2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleInheritanceEx obj=new SingleInheritanceEx();
		obj.mul1(65,78);
		obj.mul2(278, 409);
	}

}
