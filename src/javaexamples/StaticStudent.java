package javaexamples;

public class StaticStudent {

	String stdname;
	String stdgroup;
	int rolno;
	static String Collegename;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStudent std1=new StaticStudent();
		std1.init("Gauri Singh", "MSC", 7);
		std1.display();
		StaticStudent std2=new StaticStudent();
		std2.init("Manali Aggarwal","MPS", 9);
		std2.display();
		statfun();
		
	}
void init(String stdname, String stdgroup, int rolno)
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
	System.out.println("College Name "+Collegename);
}
	static void statfun()
	{
		System.out.println("Static Function ");
	}
	static 
	{
		Collegename="DPAS";
		System.out.println("College name " +Collegename);
	}
}
