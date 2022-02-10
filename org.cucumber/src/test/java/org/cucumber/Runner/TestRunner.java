package org.cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/Facebook.feature",
		glue = {"stepdefinition"}, 
		tags = {"@fb"}, 
	//	plugin = "html:target",
		plugin = "json: src/test/java/report.json",
		dryRun = false)
public class TestRunner {

}
