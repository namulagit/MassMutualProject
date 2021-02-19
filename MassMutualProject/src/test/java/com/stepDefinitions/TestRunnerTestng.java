package com.stepDefinitions;

import org.testng.annotations.DataProvider;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "com.stepDefinitions" }
,plugin= {"pretty:target/cucumber-pretty.txt",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
        })
public class TestRunnerTestng extends AbstractTestNGCucumberTests {

	

}
