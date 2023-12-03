package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\srike\\eclipse-workspace\\Sree\\src\\test\\resources\\features"},
                    dryRun = !true, 
                   glue = {"pages"} , monochrome = true ,
                  plugin = {"pretty" , "html:reports"})
public class RunnerCk extends AbstractTestNGCucumberTests {

}
