package javaexamples;

public class DuplicatecharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcddabcef";
		
		//It converts the string into an array of characters.
		char[] carry=str.toCharArray();
		
		System.out.print("Duplicate character in the above string: ");
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(carry[i] == carry[j])
				{
					System.out.print( carry[j]+ " ");
					break;
				}
			}
		}
		
	}

}
