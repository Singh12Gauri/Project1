package seleniumexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class HdfcbankingAlertWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		Alert HdfcAlert=driver.switchTo().alert();
		
		String actualmassage=HdfcAlert.getText();
		String expectedmassage="Customer ID  cannot be left blank.";
		
		HdfcAlert.accept();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actualmassage, expectedmassage);
		softassert.assertAll();
		
		System.out.println(actualmassage);
		
		driver.close();
		driver.quit();
		
	}

}
