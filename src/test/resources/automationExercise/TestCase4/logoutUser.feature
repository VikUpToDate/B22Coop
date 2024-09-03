Feature: Logout user

  Scenario Outline: Logout functionality
    Given user navigates to webpage
    And user clicks signupLogin button
    Then user verifies that 'Log in to you account' is visible
    And user enters correct '<email>' and '<password>'
    Then user clicks on log in button
    When logged in user verifies 'logged in as username' is visible
    Then user clicks logout button
    And user verifies that he's navigated to the login webpage

    Examples: logout feature test data
      | email         | password   |
      | 222@peter.com | Peter1989! |
