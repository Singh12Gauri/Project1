package cucumberStepDefination;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HRMLoginStepDefination {


	ChromeDriver driver=new ChromeDriver();

@Given("^User is on HRM login page$")
public void user_is_on_hrm_login_page() throws Throwable{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
    
}
@When("^User enter Username and Password$")
public void user_enter_username_and_password()throws Throwable {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("username")).sendKeys("Admin"); 
	driver.findElement(By.name("password")).sendKeys("admin123");
    
}
@And("^User click on the Login button$")
public void user_click_on_the_login_button() throws Throwable{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
@Then("^User shoud able to get the Home page$")
public void user_shoud_able_to_get_the_home_page()throws Throwable {
    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText().contains("Dashboard"))
//	{
//		System.out.println("Test is passed");
//	}
//	else
//	{
//		System.out.println("Test is Failed");
//	}
	
	String actualText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	String expectedText="Dashboard";
	
	Assert.assertEquals(actualText, expectedText);
	
	driver.close();
	driver.quit();
}



}
