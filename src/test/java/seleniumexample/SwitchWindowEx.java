package seleniumexample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver Obj=new ChromeDriver();
		Obj.get("https://www.salesforce.com/in/");
		Obj.findElement(By.className("cta_button")).click();
		
		Set<String> windowhandles = Obj.getWindowHandles();
		
		Iterator<String>iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		Obj.switchTo().window(childwindow);
		
		Obj.findElement(By.name("UserFirstName")).sendKeys("MRGTech");
		Obj.findElement(By.name("UserLastName")).sendKeys("Solution");
		
		Obj.switchTo().window(parentwindow);
	}

}
