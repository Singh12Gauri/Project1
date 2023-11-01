package readWrite;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesreadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//Step1: Create an object of properties class 
		Properties properties =new Properties();
		
//Step 2: Create an object of FileInputStream class  or FileReader class 
        FileInputStream input= new FileInputStream("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\peroperties\\testdata.properties");
        
//Step 3: Load the file 
        properties.load(input);
        
 //Step 4: Use get property method to get property 
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));
	
//Step 5: Create an object of FileInputStream class or FileWriter class
        FileOutputStream output=new FileOutputStream("C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\peroperties\\testdata.properties");
        
//Step 6: Use set property method to set property
        properties.setProperty("username", "Admin");
        properties.setProperty("password", "Fb12345");
        properties.store(output, null);
	
	
	}
	

}
