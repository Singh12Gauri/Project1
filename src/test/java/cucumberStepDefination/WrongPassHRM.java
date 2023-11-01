package cucumberStepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WrongPassHRM {

	ChromeDriver driver = new ChromeDriver();

	@Given("User is on orangeHRM login page")
	public void user_is_on_hrm_login_page() {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("User enter valid Username and Wrong Password")
	public void user_enter_username_and_wrong_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin1234");

	}

	@And("User cand click on the Login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

	@Then("User shoud get the error message")
	public void user_shoud_get_the_error_message() {

		String Actualmessage = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"))
				.getText();
		String Expectedmessage="Invalid credentials";
		
		Assert.assertEquals(Actualmessage, Expectedmessage);
		System.out.println(Actualmessage);
	}

}
