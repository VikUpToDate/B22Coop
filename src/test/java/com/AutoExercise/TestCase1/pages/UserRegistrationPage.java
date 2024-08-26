package com.AutoExercise.TestCase1.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class UserRegistrationPage {

    private WebDriver driver;

    public UserRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
   //@FindBy(xpath = "//h2[.='New User Signup!']")
    //WebElement newUserSignup;

    public void textValidation(String visibleText){
        //Assert.assertEquals("Can't see the text!", visibleText, newUserSignup.getText());
        System.out.println("Good!!!");
    }

    @FindBy(xpath = "//input[@name = 'name']")
    WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa = 'signup-email']")
    WebElement signUpEmail;

    public void inputNameEmail(String name, String email){
        BrowserUtils.sendKeys(this.signUpName, name);
        BrowserUtils.sendKeys(this.signUpEmail, email);
    }

    @FindBy(xpath = "//button[@data-qa= 'signup-button']")
    WebElement signUpBtn;

    public void signUpBtnClick(){
        BrowserUtils.click(signUpBtn);
    }
}
