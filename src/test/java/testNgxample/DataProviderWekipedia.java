package testNgxample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWekipedia {

	@DataProvider(name="assign")
	
	public Object[][] dataset()
	{
		return new Object[][]
				{
				{"India"},
				{"England"},
				{"Brazil"},
				{"Canada"},
				{"Sri Lanka"},
				{"United Kingdom"},
				{"United States"},
				};
	}
	
	@Test(dataProvider="assign")
	public void searchCountry(String country) throws Exception {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("searchInput")).sendKeys(country);
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
}
