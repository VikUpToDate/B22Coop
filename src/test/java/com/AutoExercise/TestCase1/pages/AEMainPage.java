package com.AutoExercise.TestCase1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AEMainPage {
    private WebDriver driver;

    public AEMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/login']")
    WebElement registrationBtn;

    public void clickOnRegistrationBtn(){
        BrowserUtils.click(this.registrationBtn, driver);
        System.out.println("code from Kobe");
    }

}
