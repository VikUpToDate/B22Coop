package com.AutoExercise.testCase7.stepDef;

import com.AutoExercise.testCase7.pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class stepDef {
    WebDriver driver = DriverHelper.getDriver();

    Page page =new Page(driver);


    @Given("user is on main page")
    public void user_is_on_main_page() {
        driver.get(ConfigReader.readProperty("autoExMainURL"));
    }
    @When("user verifies home page is visible")
    public void user_verifies_home_page_is_visible() {
page.validateHomepage();
    }
    @When("user clicks on test case button")
    public void user_clicks_on_test_case_button() {
page.clickOnTestCaseBtn();
    }
    @Then("user verifies that user is navigated to test cases page succesfully")
    public void user_verifies_that_user_is_navigated_to_test_cases_page_succesfully() {
        page.validateBeingOnTestCasesPage();

    }












}
