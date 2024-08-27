package com.AutoExercise.testCase2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {


    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

@FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    WebElement homePageHeader;


@FindBy(css = "a[href='/login']")
    WebElement SigUpLoginBtn;


public String validateHomePage(){

    return BrowserUtils.getText(this.homePageHeader,driver);
}


public void clickOnSignUpLoginBtn(){
    BrowserUtils.click(this.SigUpLoginBtn,driver);
}









}
