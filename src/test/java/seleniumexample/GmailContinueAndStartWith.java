package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailContinueAndStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AVQVeyx8J7IIP8JpK94PPOih-NLJuqxxGP4VcjLGAPHmiG9hCDLq3MbugHyEB9kvnBBmmDooPllx&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//span[starts-with(text(),'Create')]")).click();
		driver.findElement(By.xpath("//span[starts-with(text(),'For my personal')]")).click();
	}

}
