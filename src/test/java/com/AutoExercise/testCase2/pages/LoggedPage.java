package com.AutoExercise.testCase2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoggedPage {

    private WebDriver driver;

    public LoggedPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

















}
