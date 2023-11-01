package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rahul%20Harshvardhan/Downloads/WebTable.html");
		
		WebElement row =driver.findElement(By.xpath("/html/body/table/tbody/tr[3]"));
		
		WebElement column= driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]"));
		
		System.out.println(row.getText());
		System.out.println(column.getText());
	}

}
