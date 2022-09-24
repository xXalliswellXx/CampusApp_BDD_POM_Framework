Feature: Subject Categories Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Subject Category
    And User create Subject Category with "<Name>" "<Code>" and "<Status>"
    Then Success message should be displayed

    Examples:
    | Name                | Code | Status |
    | Koray Test Category | KTC  | true   |


  Scenario Outline: Edit Subject Category
    And User edit Subject Category "<Name>" with "<UpdatedName>" "<UpdatedCode>" and "<UpdatedStatus>"
    Then Success message should be displayed

    Examples:
    | Name                | UpdatedName                   | UpdatedCode | UpdatedStatus |
    | Koray Test Category | Updated Koray Test Category   | UKTC        | false         |


    Scenario Outline: Delete Subject Category
      And User delete Subject Category "<Name>"
      Then Success message should be displayed

      Examples:
      | Name                           |
      | Updated Koray Test Category    |