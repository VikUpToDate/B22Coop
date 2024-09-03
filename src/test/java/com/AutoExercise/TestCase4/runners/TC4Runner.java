package com.AutoExercise.TestCase4.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/automationExercise/TestCase4",
        glue = "com/AutoExercise/TestCase4/stepDefinitions",
        dryRun=false

)

public class TC4Runner {

}
