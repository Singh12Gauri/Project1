package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Rahul Harshvardhan\\eclipse-workspace\\MavenGauriHRM\\src\\test\\resources\\Features\\login.feature",
glue={"cucumberStepDefination"},//plugin= {"pretty","html:target/CucumberHtmlReports/report.html"},
//plugin= {"pretty","json:target/CucumberJSonReports/report.json"},
plugin= {"pretty","junit:target/CucumberJUnitReports/report.xml",
		"html:target/CucumberHtmlReports/report.html",
		"json:target/CucumberJSonReports/report.json"},
monochrome=true)

//Monochrome is for formating the output or console 
// We can create Html report , JSon report , JUnit report 
//we can also use the Tag for categories 

public class CucumberRunnerEx {

}
