package com.testrunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\prctice of java\\Selenium\\BDD_Cucmber_POM\\src\\main\\java\\com\\features\\bddpom.feature",
		glue= {"com.stepDefinitions"},
		format= {"pretty","html:test-output"},
		dryRun= false,
		monochrome= true,
		strict= true
		)
public class TestRunner {

}
