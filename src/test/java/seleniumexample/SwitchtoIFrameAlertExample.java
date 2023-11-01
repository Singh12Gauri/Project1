package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchtoIFrameAlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver f=new ChromeDriver();
		f.get("https://www.w3schools.com/java/tryjava.asp?filename=demo_switch_default");
		f.manage().window().maximize();
		//f.switchTo().frame(0);
		String Title =f.getTitle();
		System.out.println(Title);
		
		//f.switchTo().frame("iframeResult"); --- by frame id and name 
		//by WebElement
		WebElement frame1 = f.findElement(By.xpath("//div[@id='iframeResult']")); // by frameElement 
		f.switchTo().frame(frame1);
		f.getCastIssueMessage();
		
		f.switchTo().parentFrame(); // to go back to the parent frame 
		
		// f.switchTo().alert().accept(); -- to accept the alert 
		// f.switchTo().alert().dismiss(); --- to reject the alert 
		 /*String text =f.switchTo().alert().getText();
		 System.out.println(text);*/  //--- to get the text of the alert 
		
	}

}
