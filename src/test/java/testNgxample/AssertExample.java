package testNgxample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {

	
	@Test
	public void titleTest1()
	{
		String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
	}
	
	
	@Test
	public void titleTest2()
	{
		String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
	}
	
	
	
	
}
