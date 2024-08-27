package com.AutoExercise.TestCase1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class DeletingAccPage {
    private WebDriver driver;

    public DeletingAccPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2")
    WebElement deletedSuccessfullyText;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement continueBtn;

    public void deletingAcc(){
        System.out.println(deletedSuccessfullyText.getText());
        BrowserUtils.click(continueBtn);
    }

}
