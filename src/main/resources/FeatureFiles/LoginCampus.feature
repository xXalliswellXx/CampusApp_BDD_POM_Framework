Feature: Campus App Login Functionality

  Scenario: Login Admin Account
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
