package functionexamples;

//Write a program to remove spaces in below string. String s=”a b c”

public class RemoveSpaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a b c";
		System.out.println("The Original String is "+s);
		
		s=s.replaceAll("\\s+","");
		
		System.out.println("String after removing all the white space: "+s);
	}

}
