package com.AutoExercise.TestCase1.stepDefinitions;

import com.AutoExercise.TestCase1.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class registerStepDef {
    WebDriver driver = DriverHelper.getDriver();

    UserRegistrationPage registrationPage = new UserRegistrationPage(driver);
    AEMainPage mainPage = new AEMainPage(driver);
    FillOutInfoPage fillOutInfoPage = new FillOutInfoPage(driver);
    SuccessPage successPage = new SuccessPage(driver);
    AEMainPageRegistered aeMainPageRegistered = new AEMainPageRegistered(driver);
    DeletingAccPage deletingAccPage = new DeletingAccPage(driver);

    @Given("user is navigated to the register page")
    public void user_is_navigated_to_the_register_page() {
        driver.get(ConfigReader.readProperty("AERegistrationPage"));
        System.out.println(driver.getTitle());
    }

    @When("user clicks signup button")
    public void userClicksSignupLoginButton() {
        mainPage.clickOnRegistrationBtn();
    }


    @Then("user validates visible text {string}")
    public void userValidatesVisibleTextNewUserSignup(String text) {
        registrationPage.textValidation(text);
    }

    @Then("user enters name and email as follows {string} and {string}")
    public void userEntersNameAndEmailAsFollowsTestAndTestGmailCom(String name, String email) {
        registrationPage.inputNameEmail(name, email);
    }


    @And("clicks signup button")
    public void clicksSignupButton() {
        registrationPage.signUpBtnClick();
    }

    @When("user validates FillOutInfo page text {string}")
    public void userValidatesFillOutInfoPageTextEnterAccountInformation(String text) {
        registrationPage.textValidation(text);
    }


    @Then("user enters all the info and clicks create account button")
    public void userEntersAllTheInfoAndClicksCreateAccountButton() {
        fillOutInfoPage.fillOutInfo();
    }

    @Then("user see the success message and clicks continue")
    public void userSeeTheSuccessMessage() {
        successPage.validateAccountRegistration();
        successPage.continueBtnClick();
    }

    @Then("user clicks delete btn from the main page")
    public void userClicksDeleteBtnFromTheMainPage() {
        aeMainPageRegistered.deleteAccBtnClick();
    }

    @Then("user goes through the process of deleting and clicks continue")
    public void userGoesThroughTheProcessOfDeletingAndClicksContinue() {
        deletingAccPage.deletingAcc();
    }


    //*[@id="header"]/div/div/div/div[2]/div/ul/li[5]/a  acc delete
    //*[@id="form"]/div/div/div/h2 text
    //*[@id="form"]/div/div/div/div/a continue

}
