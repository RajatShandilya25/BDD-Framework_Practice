Feature: Feature to test login functionality

  Scenario: Check login success with valid credentials
  
    Given user is on login page
    When user enters Username and Password
    And clicks on login button
    Then user is navigated to homepage
    