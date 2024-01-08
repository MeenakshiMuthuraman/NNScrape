package testrunners;

import io.cucumber.core.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions

	(features = { "src/test/resources/features/WebScraping.feature" },
	 glue = {"stepDefinitions","AppHooks" }, 
	 monochrome = true,
	 tags = "",
	 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
			   "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
			   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
			 
			 
 //"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
 //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//})
 
public class MyTestRunner extends AbstractTestNGCucumberTests {

}