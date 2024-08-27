package com.AutoExercise.testCase2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoggedPage {

    private WebDriver driver;

    public LoggedPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


@FindBy(xpath = "//a[contains(text(),'Logged ')]")
    WebElement loggedInAsUserName;


@FindBy(css = "a[href='/delete_account']")
    WebElement deleteAccount;

@FindBy(xpath = "//b[.='Account Deleted!']")
    WebElement accountDeletedText;


public String validateLoggedInAsUser(){

    return BrowserUtils.getText(this.loggedInAsUserName,driver);
}

public void clickOnDeleteAccount(){
    BrowserUtils.click(this.deleteAccount,driver);
}

public String validateAccountDeletedText(){

    return BrowserUtils.getText(this.accountDeletedText,driver);
}
















}
