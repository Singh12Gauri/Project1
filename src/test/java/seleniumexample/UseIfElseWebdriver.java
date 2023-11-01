package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseIfElseWebdriver {

	public static String browser="edge";
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		d=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();
		d=new EdgeDriver();
		d.manage().window().maximize();
		}
		d.navigate().to("https://facebook.com");
		
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(10000);
		d.findElement(By.name("firstname")).sendKeys("Rani");
		d.findElement(By.name("lastname")).sendKeys("Singh");
		d.findElement(By.name("reg_email__")).sendKeys("abc43676234@gmail.com");
		d.findElement(By.name("reg_email_confirmation__")).sendKeys("abc43676234@gmail.com");
		d.findElement(By.id("password_step_input")).sendKeys("abc#123");
		d.findElement(By.name("birthday_day")).sendKeys("13");
		d.findElement(By.name("birthday_month")).sendKeys("Sep");
		d.findElement(By.name("birthday_year")).sendKeys("1995");	
		d.findElement(By.xpath("//label[text()='Female']")).click();
		d.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
