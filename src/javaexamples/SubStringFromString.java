package javaexamples;

// How to get a sub string from the string

public class SubStringFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Gauri Singh";
		
		//public String substring(int begIndex);
		System.out.println("The extracted substring is " +str.substring(6));
		
		//public String substring(int begIndex, int endIndex);
		System.out.println("The estracted substring is "+str.substring(0,6));
		
		}

}
