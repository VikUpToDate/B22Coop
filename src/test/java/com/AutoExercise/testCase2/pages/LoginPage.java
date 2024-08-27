package com.AutoExercise.testCase2.pages;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


@FindBy(xpath = "//h2[.='Login to your account']")
    WebElement loginToYourAccountHeader;


@FindBy(css = "input[data-qa='login-email']")
    WebElement email;


@FindBy(css = "input[data-qa='login-password']")
    WebElement password;

@FindBy(css = "button[data-qa='login-button']")
    WebElement loginBtn;



public  String validateLoginToYourAcc(){

    return BrowserUtils.getText(this.loginToYourAccountHeader,driver);
}


public void enterNameAndPassword(String email,String password){
    BrowserUtils.sendKeys(this.email,driver,email);
    BrowserUtils.sendKeys(this.password,driver,password);

}

public void clickOnLoginBtn(){
    BrowserUtils.click(this.loginBtn,driver);
}






}
