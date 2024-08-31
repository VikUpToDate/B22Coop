package com.AutoExercise.testCase7.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {

  public WebDriver driver;

  @Before
    public void startUp(){
      driver= DriverHelper.getDriver();

  }



  @After
    public void tearsDown(){

      driver.quit();
  }















}
