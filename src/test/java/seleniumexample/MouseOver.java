package seleniumexample;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver p=new ChromeDriver();
		p.get("https://www.ebay.com/");
		p.manage().window().maximize();
		
		
		Actions action =new Actions(p);
		action.moveToElement(p.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))).perform();
		
		WebDriverWait wait = new WebDriverWait(p, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Footwear']"))).click();
		
		//p.findElement(By.xpath("//a[text()='Footwear']")).click(); // No need to specify the this code if we use explicit wait 
		p.close();
		
		
	}

}
