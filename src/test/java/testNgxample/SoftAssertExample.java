package testNgxample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {


		@Test
		public void verifcationTitleText()
		{
			
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.ebay.com/");
			
			String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
			String actualTitle=driver.getTitle();
			
			SoftAssert softassert=new SoftAssert();
			softassert.assertEquals(actualTitle, expectedTitle,"Title verification is Faild");
			System.out.println("Title verification done");
			
			String expectedText="Search";
			String actualText=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
			
			softassert.assertEquals(actualText, expectedText,"Text verification is Faild");
			System.out.println("Text verification is done");
			
			driver.close();
			softassert.assertAll();
			
			
			
			
		}
	}


