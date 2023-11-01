package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseOfWorkingwithWebElement {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ChromeDriver obj = new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		obj.manage().window().maximize();
		
		//Thread.sleep(1000);
		/*Wait<WebDriver> wait =new FluentWait<WebDriver>(obj);
		withTimeout(Duration.ofSeconds(30L));
		pollingEvery(Duration.ofSeconds(5L));
		ignoring(NoSuchElementException.class);*/
		
		WebDriverWait wait = new WebDriverWait(obj,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
	
		obj.findElement((By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))).sendKeys("Gauri");	
		
// 15.	clear() 
		obj.findElement(By.name("username")).clear();
		
//17.	getAttribute(java.lang.String name
		String str = obj.findElement(By.name("username")).getAttribute("class");
		System.out.println(str);
		
//18.	getCssValue(java.lang.string propertyname) 
		String str1 = obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getCssValue("background-color");
		System.out.println(str1);
		
//19. size / location / text / tagname / isDisplayed / isEnabled / is Selected 
		
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getSize());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getLocation());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getText());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getTagName());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isDisplayed());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isEnabled());
		System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isSelected());
	}

	private static void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private static void withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}
