Feature: Login with incorrect information
  Scenario: login functionality
    Given user navigates to web page
    And user validates home page is visible
    Then user click on signup login button
    And user verify Login to your Account is visible
    Then user enter correct email as 'testcase2@hotmail.com' and password as '1234567'
    And user clicks on login button
    And user validates Logged in as username is viisble
    Then user click delete account button
    And user validate account deleted is visible