package seleniumexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver k=new ChromeDriver();
		k.get("https://jqueryui.com/");
		k.manage().window().maximize();
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		k.findElement(By.xpath("//a[text()='Resizable']")).click();
		
		WebElement frame=k.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		k.switchTo().frame(frame);
		
		WebElement square= k.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Actions action=new Actions(k);
		action.contextClick(square).perform();  // to do right click 
	}

}
