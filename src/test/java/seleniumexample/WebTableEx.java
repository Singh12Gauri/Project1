package seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asx.com.au/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept All Cookies']")))
				.click();

		driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/h5[2]")).click();
		List<WebElement> row = driver
				.findElements((By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr")));
		System.out.println(row.size());
		int rowsize = row.size();

		List<WebElement> column = driver
				.findElements((By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[2]/td")));
		System.out.println(column.size());
		int colsize = column.size();

		Thread.sleep(2000);
		for (int i = 1; i <= rowsize; i++) {
			for (int j = 1; j <= colsize; j++) {

				System.out.println(driver
						.findElement(By.xpath(
								"//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[" + i + "]/td[" + j + "]"))
						.getText() + " ");

			}
			System.out.println();
		}

	}

}
