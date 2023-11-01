package seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> al = driver.findElements(By.tagName("a"));
		System.out.println("Total no of link are :" + al.size());

		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Links on the page are :" + al.get(i).getAttribute("href"));
			System.out.println("Visible Text for link are :" + al.get(i).getText());
		}
	}

}
