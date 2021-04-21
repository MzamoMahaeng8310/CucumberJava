package StepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo.feature",
glue= {"StepsDefinition"},
monochrome = true, //Formatted view
//For reporting 
//htlm reports under the target folder
//plugin = {"pretty","html:target/HtmlReports"},
//JSON reports 
//plugin = {"pretty", "json:target/JSONReports/report.json"}
//JUnit report 
//plugin = {"pretty", "junit:target/JUnitReports/report.xml"}
//you can make provision for all 2 report formants, HTLM. JSON and JUniy XML
plugin = {"pretty", "junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports"},
//Create tags and execute the features associated with the tags
tags = "@LoginDemo"
		
		)


public class TestRunner {

}
