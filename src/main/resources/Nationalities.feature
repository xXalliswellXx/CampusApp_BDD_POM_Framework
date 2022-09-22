Feature: Nationalities Function

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Nationality Test
    And User create Nationality with "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                     |
    | Koray Test Nationality 1 |
    | Koray Test Nationality 2 |
    | Koray Test Nationality 3 |


  Scenario Outline: Edit Nationality Test
    And User edit Nationality "<Name>" with "<UpdatedName>"
    Then Success message should be displayed

    Examples:
    | Name                     | UpdatedName                      |
    | Koray Test Nationality 1 | Updated Koray Test Nationality 1 |
    | Koray Test Nationality 2 | Updated Koray Test Nationality 2 |
    | Koray Test Nationality 3 | Updated Koray Test Nationality 3 |


  Scenario Outline: Delete Nationality Test
    And User delete Nationality "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                             |
    | Updated Koray Test Nationality 1 |
    | Updated Koray Test Nationality 2 |
    | Updated Koray Test Nationality 3 |