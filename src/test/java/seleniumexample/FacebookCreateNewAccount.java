package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver face=new ChromeDriver();
		face.manage().window().maximize();
		
		face.get("https://facebook.com");
		
		face.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		face.findElement(By.name("firstname")).sendKeys("Rani");
		face.findElement(By.name("lastname")).sendKeys("Singh");
		face.findElement(By.name("reg_email__")).sendKeys("abc43676234@gmail.com");
		face.findElement(By.name("reg_email_confirmation__")).sendKeys("abc43676234@gmail.com");
		face.findElement(By.id("password_step_input")).sendKeys("abc#123");
		face.findElement(By.name("birthday_day")).sendKeys("13");
		face.findElement(By.name("birthday_month")).sendKeys("Oct");
		face.findElement(By.name("birthday_year")).sendKeys("1995");	
		face.findElement(By.xpath("//label[text()='Female']")).click();
		face.findElement(By.xpath("//button[text()='Sign Up']")).click();
		face.close();
	}

	}


