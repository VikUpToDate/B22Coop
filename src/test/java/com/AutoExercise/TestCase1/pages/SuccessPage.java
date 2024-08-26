package com.AutoExercise.TestCase1.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SuccessPage {

    private WebDriver driver;

    public SuccessPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement successMessage;

    public void validateAccountRegistration(){
        Assert.assertEquals("Can't see the text!", "ACCOUNT CREATED!", successMessage.getText());
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement continueBtn;

    public void continueBtnClick(){
        BrowserUtils.click(continueBtn);
    }

}
