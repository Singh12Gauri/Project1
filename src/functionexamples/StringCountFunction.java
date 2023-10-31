package functionexamples;

public class StringCountFunction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Gauri Singh";
		
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			count++;
		}
		System.out.println("Length of string is "+count);
		
	}

}
