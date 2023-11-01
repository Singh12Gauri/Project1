package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AYZoVhejJ2ayJtAZaUmXy_ahsAtwR1npjCxIkwm_NcTAChOYZDe_qast08bvTBrZWtr3l_E2M0GL&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		d.findElement(By.xpath("//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c']")).click();
		d.findElement(By.name("firstName")).sendKeys("Ravi");
		d.findElement(By.name("lastName")).sendKeys("Bansal");
		d.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(10000);
		d.findElement(By.name("day")).sendKeys("19");
		d.findElement(By.name("year")).sendKeys("1997");
		d.findElement(By.id("month")).sendKeys("June");
		Thread.sleep(1000);
		d.findElement(By.xpath("//select[@id=\"gender\"]/option[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(1000);
		d.findElement(By.name("Username")).sendKeys("rb088190");
		d.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		d.findElement(By.name("Passwd")).sendKeys("Ravi@191997");
		d.findElement(By.name("PasswdAgain")).sendKeys("Ravi@191997");
		d.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("9828674501");
		d.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		
	}

}
