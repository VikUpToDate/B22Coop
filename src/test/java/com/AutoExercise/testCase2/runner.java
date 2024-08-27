package com.AutoExercise.testCase2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.checkerframework.checker.units.qual.C;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/automationExercise/testCase2",
        glue = "com/AutoExercise/testCase2/stepDef",
        dryRun=false

)


public class runner {
}
