package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver m=new ChromeDriver();
		
		m. get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement passwordField = m.findElement(By.name("password"));
		
		//WebElement emailFeild = m.findElement(withTagName("input").above(passwordField));
	}

}
