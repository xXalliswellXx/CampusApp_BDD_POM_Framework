Feature: Grade Levels Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Add Grade Level Test
    And User create Grade Level with "Test Grade" "TG" and "123456"
    Then Success message should be displayed


  Scenario: Edit Grade Level Test
    And User edit Grade Level "Test Grade" with "Updated Test Grade" "UTG" and "12345600"
    Then Success message should be displayed


  Scenario: Delete Grade Level Test
    And User delete Grade Level with "Updated Test Grade"
    Then Success message should be displayed
