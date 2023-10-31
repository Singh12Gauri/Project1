package functionexamples;

//Write above first program using constructor

public class ConstructorExample {

	String Name;
	String Group;
	int Id;
	static String CollegeName;

	// Constructor has same name of the class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample S1=new ConstructorExample("Gauri Singh","MSC",4);
		S1.display();
		ConstructorExample S2=new ConstructorExample("Parul Verma","MBS",5);
		S2.display();
		ConstructorExample S3=new ConstructorExample("Shalu Singh","MBBS",6);
		S3.display();
		
	}
	
ConstructorExample(String studname,String studgroup,int studId)
	
	{
		 Name=studname;
		 Group=studgroup;
		 Id=studId;
		
		}
	
	void display() 
	{
			System.out.println("Name "+Name);
			System.out.println("Group "+Group);
			System.out.println("Rollno "+Id);
			
	}
	static
	{
		CollegeName="Shardha University";
		System.out.println("College Name is "+CollegeName);
	}


	}


