package seleniumexample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver h=new ChromeDriver();
		
//1.	get(java.lang.String url) 
		h.get("https://google.com");//Load a new web page in the current browser window.
		
//2.	manage()
		h.manage().window().maximize(); //manage() method-- gets the option interface
		
//3.	getCurrentUrl()
		String currentUrl = h.getCurrentUrl(); //Get a string representing the current URL that the browser is looking at. 
		System.out.println(currentUrl);
		
//4.	getTitle()
		String title =h.getTitle();// The title of the current page 
		System.out.println(title);
		
//5.	getPageSource()
		String pagesource =h.getPageSource();//Get the source of the last loaded page.
		System.out.println(pagesource);
		
//6.	navigate()
		h.navigate().to("https://facebook.com"); //An abstraction allowing the driver to access the browser's history and to navigate to a given URL.
	
//9.	findElement(By by)
		h.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("What is Selenium");
		
//10.	findElements(By by)
		List<WebElement> webelement= h.findElements(By.xpath("//div[@class='inventory-lists']/div"));
		System.out.println(webelement);

//12.	getWindowHandle()
		h.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = h.getWindowHandle();
		System.out.println(windowhandle);
		
//13.	getWindowHandles()
		h.findElement(By.xpath("//div[@class='inventory-lists']/div")).click();
		Set<String> windowhandles = h.getWindowHandles();
		System.out.println(windowhandles);



		
		h.close(); //Close the current window, quitting the browser if it's the last window currently open 
		
		// h.quit(); -- Quits this driver, closing every associated window.
	
		
	
	}
	

}
