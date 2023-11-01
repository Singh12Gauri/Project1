package seleniumexample;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver q=new ChromeDriver();
		q.get("https://jqueryui.com/droppable/");
		q.manage().window().maximize();
	
		q.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame= q.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		q.switchTo().frame(frame);
		
		WebElement drag=q.findElement(By.id("draggable"));
		WebElement drop=q.findElement(By.id("droppable"));
		
		Actions action=new Actions(q);
		action.dragAndDrop(drag, drop).perform();
		
		
	}

}
