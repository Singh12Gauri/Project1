package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import org.testng.asserts.SoftAssert;

public class AssertionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(5));
		
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle= driver.getTitle();
		
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertEquals(expectedtitle, actualtitle);
		softAssert.assertAll();
		
	}
	}

