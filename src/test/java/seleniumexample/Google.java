package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(1000);
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("What is Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='what is selenium']")).click();
		
	}
}
