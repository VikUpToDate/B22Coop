package com.AutoExercise.TestCase1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FillOutInfoPage {
    private WebDriver driver;

    public FillOutInfoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"uniform-id_gender1\"]")
    WebElement CBoxMale;

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement inputName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"days\"]")
    WebElement DDDay;

    @FindBy(xpath = "//*[@id=\"months\"]")
    WebElement DDMonth;

    @FindBy(xpath = "//*[@id=\"years\"]")
    WebElement DDYear;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label")
    WebElement CBoxNewsletter;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]/label")
    WebElement CBoxSpecOffers;


    //Address information
    @FindBy(xpath = "//*[@id=\"first_name\"]")
    WebElement FName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    WebElement LName;

    @FindBy(xpath = "//*[@id=\"company\"]")
    WebElement companyName;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    WebElement companyAddress;

    @FindBy(xpath = "//*[@id=\"country\"]")
    WebElement DDCountry;

    @FindBy(xpath = "//*[@id=\"state\"]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    WebElement zip;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    WebElement phone;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    WebElement createAccountBtn;

    public void fillOutInfo(){
        BrowserUtils.click(this.CBoxMale);
        BrowserUtils.sendKeys(inputName, "Vik");
        BrowserUtils.sendKeys(inputPassword, "123123");
        BrowserUtils.selectBy(DDDay, "20", "visibleText");
        BrowserUtils.selectBy(DDMonth, "February", "visibleText");
        BrowserUtils.selectBy(DDYear, "2000", "visibleText");
        BrowserUtils.click(CBoxNewsletter);
        BrowserUtils.click(CBoxSpecOffers);
        BrowserUtils.sendKeys(FName, "V");
        BrowserUtils.sendKeys(LName, "P");
        BrowserUtils.sendKeys(companyName, "codeFish");
        BrowserUtils.sendKeys(companyAddress, "123 Daddy Road");
        BrowserUtils.selectBy(DDCountry, "United States", "visibleText");
        BrowserUtils.sendKeys(state, "Illinois");
        BrowserUtils.sendKeys(city, "Chicago");
        BrowserUtils.sendKeys(zip, "60000");
        BrowserUtils.sendKeys(phone, "12333322211");
        BrowserUtils.click(createAccountBtn);
    }




}
