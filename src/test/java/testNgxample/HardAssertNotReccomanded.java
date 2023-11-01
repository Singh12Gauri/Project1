package testNgxample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertNotReccomanded {

	@Test
	public void titleandTextVerification()
	{
		String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText= "Search";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle=driver.getTitle();
		String actualText=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title Test is Failed");
		
		Assert.assertEquals(actualText, expectedText, "Text Test is Failed");
		
		//If one assert is failed than the whole program is terminated 
	}
	
	
	
	
	
}
