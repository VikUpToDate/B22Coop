package com.AutoExercise.testCase2.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Hook {

    public WebDriver driver;


    @Before
    public void startUp(){

        driver= DriverHelper.getDriver();

    }


    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }






}
