package seleniumexample;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetBankingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver e=new ChromeDriver();
		
		e.get("https://netbanking.hdfcbank.com/netbanking/");
	}

}
