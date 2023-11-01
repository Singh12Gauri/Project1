package seleniumexample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		Wait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver)
//		.withTimeout(Duration.ofSeconds(20))
//		.pollingEvery(Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		
		
// Single Select drop down 
		WebElement day =driver.findElement(By.name("birthday_day"));
		Select select =new Select(day);
		
		select.selectByIndex(14);
		
		WebElement month =driver.findElement(By.name("birthday_month"));
		Select select1 =new Select(month);
		
		select1.selectByVisibleText("Sep");
		
		WebElement year =driver.findElement(By.name("birthday_year"));
		Select select2 =new Select(year);
		
		select2.selectByValue("1993");
		
//Multiselect drop down 
		ChromeDriver driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get(" ");     					//no xample website to show the multi select and deselect 
		Thread.sleep(5000);
		WebElement ddown=driver1.findElement(By.id(""));
		Select select3 =new Select(ddown);
		select3.selectByValue("");
		select3.selectByIndex(0);
		select3.selectByVisibleText("");
		
		List<WebElement>attItems= select3.getAllSelectedOptions();
		
		System.out.println(attItems.size());
		
//Deselect
		select3.deselectAll();
		
		select3.deselectByIndex(0);
		select3.deselectByValue("");
		select3.deselectByVisibleText("");
		
		
		
		
		
		
		
	}

}
