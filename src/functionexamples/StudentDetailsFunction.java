package functionexamples;

//Write above program by using static variable and static block. Add one one static variable with name as college name.
//Update Student details program by using this keyword

public class StudentDetailsFunction {
	
	String Name;
	String Group;
	int Id;
	static String CollegeName;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetailsFunction S1=new StudentDetailsFunction();
		S1.studentdetail("Gauri Singh","MSC",4);
		S1.display();
		StudentDetailsFunction S2=new StudentDetailsFunction();
		S2.studentdetail("Parul Verma","MBS",5);
		S2.display(); 
		StudentDetailsFunction S3=new StudentDetailsFunction();
		S3.studentdetail("Shalu Singh","MBBS",6);
		S3.display();
		
	}
	
	void studentdetail(String studname,String studgroup,int studId)
	
	{
		 this.Name=studname;
		 this.Group=studgroup;
		 this.Id=studId;
		
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
	

