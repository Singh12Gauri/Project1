package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\Features\\wrongPassHRM.feature",
glue={"cucumberStepDefination"})

public class WrongPassHRM {

}
