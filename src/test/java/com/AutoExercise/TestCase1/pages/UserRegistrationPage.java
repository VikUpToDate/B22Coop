package com.AutoExercise.TestCase1.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationPage {

    private WebDriver driver;

    public UserRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    WebElement newUserSignup;

    public void textValidation(String visibleText){
        Assert.assertEquals("Can't see the text!", visibleText, newUserSignup.getText());
    }
}
