package functionexamples;

//Write a program to delete duplicate letters in below in a string s=”abcdab”

public class DeleteDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abcdab";
		System.out.println("Old String is: "+str);
		System.out.println("New String is: "+removeDupliChar(str));
	}

	public static String removeDupliChar(String str)
	{
		String newStr ="";
		
		for(int i=0; i<str.length();i++)
		{
			char ch= str.charAt(i);
			if (newStr.indexOf(ch)== -1)
			{
				newStr=newStr+ch;
			}
		}
		return newStr;
	}
	
}
