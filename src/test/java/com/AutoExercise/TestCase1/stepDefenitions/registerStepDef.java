package com.AutoExercise.TestCase1.stepDefenitions;

import com.AutoExercise.TestCase1.pages.AEMainPage;
import com.AutoExercise.TestCase1.pages.UserRegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class registerStepDef {
    WebDriver driver = DriverHelper.getDriver();

    UserRegistrationPage registrationPage = new UserRegistrationPage(driver);
    AEMainPage mainPage = new AEMainPage(driver);

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
}
