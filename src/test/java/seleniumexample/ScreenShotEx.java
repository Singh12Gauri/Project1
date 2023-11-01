package seleniumexample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class ScreenShotEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		
		Date currentdate =new Date();
		//System.out.println(currentdate); 
		String screenshotfilename = currentdate.toString().replace(" ","-").replace(":","-");
		//System.out.println(screenshotfilename);
		
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File(".//screenshot//"+screenshotfilename+ ".png"));
		
		//FileUtils.copyFile(screenshotfile, new File("C:\\.png")); --- unable to store in system folder 
		
	}

}
