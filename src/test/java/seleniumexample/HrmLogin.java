package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Web drivers//chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "C:\\Web drivers//geckodriver.exe");
	//System.setProperty("webdriver.edge.driver", "C:\\Web drivers//msedgedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver s=new ChromeDriver(); //ChromeDriver is predefined class 
		
		s.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(s,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
		
		//s.findElement(By.name("username")).sendKeys("Admin"); //findElement is predefined method 
		s.findElement(By.name("password")).sendKeys("admin123"); //username and password is field is from inspect
		s.findElement(By.xpath("//button[@type='submit']")).click();
		s.close();
	}
}
