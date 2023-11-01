package readWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTXTandCSVEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//Step 1: Create an object of the FileWriter Class 
		//for csv file creation 
		FileWriter fr =new FileWriter("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\CSV\\TestData.csv");
		
		// For txt file creation 
		//FileWriter fr =new FileWriter("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\CSV\\TestData.txt");
		
//Step 2: Create object of BufferedWriter Class  
		BufferedWriter br=new BufferedWriter(fr);
		
//Step 3: Write Data 
		br.write("Facebook Login Details" + ",");
		
		//br.write("Facebook Login Details"); // to write in txt file 
		
//Step 4: Close 
		br.close();
		
		
		
	}

}
