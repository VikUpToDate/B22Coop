package com.AutoExercise.testCase7.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class Page {

    private WebDriver driver;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



 @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    WebElement homePageText;

@FindBy(xpath = "//a[.=' Test Cases']")
WebElement testCasesBtn;

@FindBy(xpath = "//h2[@class='title text-center']")
WebElement testCasesTitle;



public void validateHomepage(){
 String expected ="Full-Fledged practice website for Automation Engineers";
    Assert.assertEquals("failed to validate home page visible",expected, BrowserUtils.getText(this.homePageText,driver));
}

public void clickOnTestCaseBtn(){
    BrowserUtils.click(this.testCasesBtn,driver);
}


public void validateBeingOnTestCasesPage(){
String expected="TEST CASES";
Assert.assertEquals("failed to validate it",expected,BrowserUtils.getText(this.testCasesTitle,driver));

}









}
