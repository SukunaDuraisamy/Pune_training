Feature: Login functionality
@tag1
  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid Personal Details
    When user enters valid password
    And I click on login
    Then I'm in account login page 
    
@tag2
Scenario: Extract Phone number
Given In login page
When Display Phone number
Then close the program

@tag1 @tag2
Scenario: Extract Phone number
Given In login page
When Display Phone number
Then close the program