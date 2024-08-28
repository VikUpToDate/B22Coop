Feature: Registering user

  @usualTest
  Scenario Outline: Positive test for registering user functionality
    Given user is navigated to the register page
    When user clicks signup button
    Then user validates visible text 'New User Signup!'
    Then user enters name and email as follows '<name>' and '<email>'
    And clicks signup button
    When user validates FillOutInfo page text 'Enter Account Information'
    Then user enters all the info and clicks create account button
    Then user see the success message and clicks continue
    Then user clicks delete btn from the main page
    Then user goes through the process of deleting and clicks continue
    #Then user validates visible text 'Enter Account Information'

      Examples:
        | name | email |
        | werttrew | werttrew@gmail.com |