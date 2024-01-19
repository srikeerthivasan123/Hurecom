package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;






@CucumberOptions(features = {"C:\\Users\\srike\\eclipse-workspace\\West\\src\\test\\resources\\features" }, 
dryRun = !true, 
glue = {"st"}, 
snippets = SnippetType.CAMELCASE, 
monochrome = true )

public class runn extends AbstractTestNGCucumberTests {

}
