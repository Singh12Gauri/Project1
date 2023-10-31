package functionexamples;

	interface Sum  // interface contains abstract method 
	{
		void Add(int p, int q); // it always consider as public/ abstract keyword 
	}
	interface Differnce
	{
		void Sub(int p, int q);
	}
	class Multiple implements Sum, Differnce 
	 {
		public void Add(int p, int q)

		{
			int add=p+q; //it always adds public, static, final keyword before data // any variable is final inside interface 
			System.out.println("Sum of two no. are : "+add);
		}
		public void Sub(int p, int q)
		{
			int sub=p-q;
			System.out.println("Subtraction of two no. are : "+sub);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiple m=new Multiple();
		m.Add(120,30);
		m.Sub(90,20);
	}

}
