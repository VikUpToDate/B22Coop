Feature: Registering user

  Scenario: Positive test for registering a user functionality
    Given user is navigated to the register page
    When user clicks signup button
    Then user validates visible text 'New User Signup!'
    Then user enters name and email as follows 'Test' and 'test@gmail.com'
    And clicks signup button
    #Then user validates visible text 'Enter Account Information'
