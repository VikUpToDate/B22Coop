package com.AutoExercise.testCase2.stepDef;

import com.AutoExercise.testCase2.pages.LoggedPage;
import com.AutoExercise.testCase2.pages.LoginPage;
import com.AutoExercise.testCase2.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class stepDef {

    WebDriver driver = DriverHelper.getDriver();

    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    LoggedPage loggedPage = new LoggedPage(driver);


    @Given("user navigates to web page")
    public void user_navigates_to_web_page() {
        driver.get(ConfigReader.readProperty("autoExMainURL"));

    }
    @Given("user validates home page is visible")
    public void user_validates_home_page_is_visible() {
        String actual = mainPage.validateHomePage();
        String expected = "Full-Fledged practice website for Automation Engineers";
        Assert.assertEquals("failed to validate the text ",expected,actual);

    }
    @Then("user click on signup login button")
    public void user_click_on_signup_login_button() {
        mainPage.clickOnSignUpLoginBtn();

    }
    @Then("user verify Login to your Account is visible")
    public void user_verify_login_to_your_account_is_visible() {
        String actual = loginPage.validateLoginToYourAcc();
        String expected = "Login to your account";
        Assert.assertEquals("failed to validate the title ",expected,actual);

    }
    @Then("user enter correct email as {string} and password as {string}")
    public void user_enter_correct_email_as_and_password_as(String email, String password) {
        loginPage.enterNameAndPassword(email, password);

    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginBtn();

    }
    @Then("user validates Logged in as username is viisble")
    public void user_validates_logged_in_as_username_is_viisble() {
        String actual = loggedPage.validateLoggedInAsUser();
        String expected = "Logged in as meryem nowak";
        Assert.assertEquals("failed to validate the text ",expected,actual);

    }
    @Then("user click delete account button")
    public void user_click_delete_account_button() {
        loggedPage.clickOnDeleteAccount();

    }
    @Then("user validate account deleted is visible")
    public void user_validate_account_deleted_is_visible() {
        String actual = loggedPage.validateAccountDeletedText();
        String expected ="ACCOUNT DELETED!";
        Assert.assertEquals("failed to validate delete account text  ",expected,actual);

    }























}
