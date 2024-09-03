package com.AutoExercise.TestCase4.stepDefinitions;

import com.AutoExercise.TestCase4.pages.HomePage;
import com.AutoExercise.TestCase4.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class LogoutStepDefinitions {

    WebDriver driver = DriverHelper.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Given("user navigates to webpage")
    public void user_navigates_to_webpage() {
        driver.get(ConfigReader.readProperty("autoExMainURL"));
    }
    @Given("user clicks signupLogin button")
    public void user_clicks_signup_login_button() {
        homePage.clickOnSignUpLogInBtn();
    }
    @Then("user verifies that {string} is visible")
    public void user_verifies_that_is_visible(String text) {
        loginPage.validateLoginPage(text);
    }
    @Then("user enters correct {string} and {string}")
    public void user_enters_correct_and(String email, String password) {
        loginPage.enterEmailPassword(email, password);
    }
    @Then("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        loginPage.clickLoginBtn();
    }
    @When("logged in user verifies {string} is visible")
    public void logged_in_user_verifies_is_visible(String pageTitle) {
       loginPage.validateLoginPage(pageTitle);
    }
    @Then("user clicks logout button")
    public void user_clicks_logout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that he's navigated to the login webpage")
    public void user_verifies_that_he_s_navigated_to_the_login_webpage(String pageTitle) {
        loginPage.validateLoginPage(pageTitle);
    }


}
