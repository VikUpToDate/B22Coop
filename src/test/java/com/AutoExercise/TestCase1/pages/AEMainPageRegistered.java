package com.AutoExercise.TestCase1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AEMainPageRegistered {
    private WebDriver driver;

    public AEMainPageRegistered (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement deleteAccBtn;

    public void deleteAccBtnClick(){
        BrowserUtils.click(deleteAccBtn);
    }
}
