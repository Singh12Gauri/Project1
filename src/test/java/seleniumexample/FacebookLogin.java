package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver s=new ChromeDriver();
		
		s.get("https://facebook.com");
		s.manage().window().maximize();
		
		s.findElement(By.name("email")).sendKeys("humanbeing12345.com");
	    s.findElement(By.name("pass")).sendKeys("Human@15");
	    s.findElement(By.name("login")).click();
	   
	}

}
