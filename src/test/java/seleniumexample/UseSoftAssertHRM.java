package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.asserts.SoftAssert;


public class UseSoftAssertHRM {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin"); 
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
	
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertAll();
		System.out.println(actualTitle);
		
		driver.close();
		driver.quit();
	}

}
