package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver l=new ChromeDriver();
		l.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
//1. Basic 
		l.findElement(By.xpath("//input[@name='username']")).sendKeys("Harsh");
		
//2. Function --> starts-with 
		l.findElement(By.xpath("//input[starts-with(@class,'oxd')]")).sendKeys("Harsh");
		
//3. Function --> contains 
		l.findElements(By.xpath("//input[contains(@class,'active')]")); 
		
//4. text() method 
		l.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
//5. AND OR
		l.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']")).sendKeys("Harsh");
	}

}
