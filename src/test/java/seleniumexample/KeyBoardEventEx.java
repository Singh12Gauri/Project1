package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement SourceTextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]//div[10]/pre/span"));
	    Actions action=  new Actions(driver);
	    action.keyDown(SourceTextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	    
	    WebElement distinationtextarea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[8]/pre"));
	    action.keyDown(distinationtextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
	}

}
