package seleniumexample;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		//m.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		m.get("https://www.ebay.com/");
//Explicit wait 
		WebDriverWait wait = new WebDriverWait(m,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"))).click();
		
//Fluent Wait 
		FluentWait<WebDriver> wait1 =new FluentWait<WebDriver>(m)  //Declare and initialise a fluent wait
				.withTimeout(Duration.ofSeconds(10)) 				//Specify the timout of the wait
				.pollingEvery(Duration.ofSeconds(2)) 					//Sepcify polling time
				.withMessage("MRGTech Solution: This is the Custome Message") // If want to show any message 
				.ignoring(NoSuchElementException.class); 				//Specify what exceptions to ignore
				
					/*Wait<WebDriver>: This creates a new Wait object that waits for a WebDriver instance.
					new FluentWait<WebDriver>(driver): This creates a new Fluent Wait object that waits for a specific WebDriver instance.
					withTimeout(Duration.ofSeconds(30)): This sets the maximum time to wait for a certain condition to be met. In this example, the wait time is set to 30 seconds.
					polling every (Duration.ofSeconds(5)): This sets the polling interval, or the time interval, to wait between each check to see if the condition has been met. In this example, the interval is set to 5 seconds.
					ignoring(NoSuchElementException.class): This specifies any exceptions to ignore during the wait.*/
		
		m.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
		m.findElement(By.className("b-visualnav__title")).click();
		
		
	}

	

}
