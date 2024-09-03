package com.AutoExercise.TestCase4.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h2[.='Login to your account']")
    WebElement loginToYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPassword;

    public void enterEmailPassword(String email, String password){
        BrowserUtils.sendKeys(this.loginEmail, driver, email);
        BrowserUtils.sendKeys(this.loginPassword, driver, password);
    }

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement clickLoginBtn;

    public void clickLoginBtn(){
        BrowserUtils.click(this.clickLoginBtn, driver);
    }

    @FindBy(xpath = "//title[.='Automation Exercise - Signup / Login']")
    WebElement loginPageTitle;

    public void validateLoginPage(String expectedTitle){
        BrowserUtils.getText(this.loginPageTitle, driver);
    }

}
