package functionexamples;

public class ThisKeywordEx {
	int x;
	 ThisKeywordEx(int x)
	{
		this.x=x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordEx obj=new ThisKeywordEx(7);
		System.out.println("Value of x is " + obj.x);
	}

}
