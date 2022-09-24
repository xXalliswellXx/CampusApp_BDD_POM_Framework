Feature: Position Categories Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Position Category Test
    And User add Position Category with "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                         |
    | Koray Test Position Category |


  Scenario Outline: Edit Position Category Test
    And User edit Position Category "<Name>" with "<UpdatedName>"
    Then Success message should be displayed

    Examples:
    | Name                         | UpdatedName                          |
    | Koray Test Position Category | Updated Koray Test Position Category |


  Scenario Outline: Delete Position Category Test
    And User delete Position Category "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                                 |
    | Updated Koray Test Position Category |