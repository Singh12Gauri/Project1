package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept All Cookies']"))).click();
		Thread.sleep(5000);
		driver.findElement(By.name("doi")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("doi")).click();
		
	}

}
