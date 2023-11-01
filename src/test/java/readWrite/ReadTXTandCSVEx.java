package readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTXTandCSVEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader fr=new FileReader("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\CSV\\TestData.txt");
		
		
		BufferedReader br =new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		br.close();
		
		
	}

}
