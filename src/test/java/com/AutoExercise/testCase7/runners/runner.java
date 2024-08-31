package com.AutoExercise.testCase7.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/automationExercise/TestCase7", //path to feature file that starts from src
        glue = "com/AutoExercise/testCase7/stepDef",     //path to stepdef that starts from com
        dryRun = false,  //make it true to get snippets
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)








public class runner {
}
