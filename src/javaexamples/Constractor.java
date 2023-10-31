package javaexamples;

public class Constractor {
	String stdname;
	String stdgroup;
	int rolno;
	static String Collegename="DPAS";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constractor std1=new Constractor("Gauri Singh", "MSC", 7);
		std1.display();
		Constractor std2=new Constractor("Manali Aggarwal","MPS", 9);
		std2.display();
		statfun();
		
	}
Constractor(String stdname, String stdgroup, int rolno)
{
	this.stdname=stdname;
	 this.stdgroup=stdgroup;
	 this.rolno=rolno;
}
void display()
{
	System.out.println("Name " + stdname);
	System.out.println("Group " + stdgroup);
	System.out.println("Rolno " + rolno);
	
}
	static void statfun()
	{
		System.out.println("Static Function ");
	}
	static 
	{
		System.out.println("College name " +Collegename);
	}


	}


