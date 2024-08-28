package com.AutoExercise.TestCase1.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.awt.*;
import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/automationExercise/TestCase1", // path to feature file/cucumber file
        glue = "com/AutoExercise/TestCase1/stepDefinitions", // path to stepDef
        dryRun = false, // if this is set to true, it will generate snippets if step definition is not defined yet
        plugin = {"pretty", "html:target/cucumber-reports.html", "rerun:target/uiFailedTest.txt"},
        tags = "@usualTest"
)
public class Runner {
    @AfterClass
    public static void openReport() {
        // Opening the report
        WebDriver driver = DriverHelper.getDriver();
        driver.get("C:\\Everything\\TeamProject\\target\\cucumber-reports.html");
    }
}
