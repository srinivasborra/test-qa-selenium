package com.test.qa.Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= "QA/com/test/qa/feature"
			,glue = {"helpers","com.test.qa.stepdefinition"}
			,plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
					"html:target/cucumber-reports"}
			,dryRun=false
			,monochrome = true
			//,tags="@RestTest"
			)
public class CucumberRunner{
	
}
//public class CucumberRunner extends AbstractTestNGCucumberTests {
//
//	
//}
