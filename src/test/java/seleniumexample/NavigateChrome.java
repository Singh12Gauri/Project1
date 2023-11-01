package seleniumexample;

import org.openqa.selenium.edge.EdgeDriver;

public class NavigateChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver d = new EdgeDriver();
		
		d.navigate().to("https://google.com");
		
	}

	}


