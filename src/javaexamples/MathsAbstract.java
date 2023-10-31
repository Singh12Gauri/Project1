package javaexamples;

abstract class Addition{

	 public abstract void add(int x, int y);

	}

	class Maths extends Addition {
		public void add(int x , int y)
		{
			int add=x+y;
			System.out.println("Sum of two nos are : "+add);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Maths d=new Maths();
			d.add(23 , 98);
			
			
		}
		}

