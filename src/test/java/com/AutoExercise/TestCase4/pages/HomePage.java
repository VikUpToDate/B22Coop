package com.AutoExercise.TestCase4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/login']")
    WebElement signupLoginButton;

    public void clickOnSignUpLogInBtn(){
        BrowserUtils.click(this.signupLoginButton, driver);
    }

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logoutButton;

    public void clickLogoutBtn(){
        BrowserUtils.click(this.logoutButton, driver);
    }


}
