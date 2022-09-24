Feature: Positions Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Position Test
    And User create Position with "<Name>" "<ShortName>" and "<Status>"
    Then Success message should be displayed

    Examples:
    | Name                  | ShortName | Status |
    | Koray Test Position 1 | KTP1      | true   |
    | Koray Test Position 2 | KTP2      | false  |


  Scenario Outline: Edit Position Test
    And User edit Position "<Name>" with "<UpdatedName>" "<UpdatedShortName>" and "<UpdatedStatus>"
    Then Success message should be displayed

    Examples:
    | Name                  | UpdatedName                   | UpdatedShortName | UpdatedStatus |
    | Koray Test Position 1 | Updated Koray Test Position 1 | UKTP1            | false         |
    | Koray Test Position 2 | Updated Koray Test Position 2 | UKTP2            | true          |


  Scenario Outline: Delete Position Test
    And User delete Position "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                          |
    | Updated Koray Test Position 1 |
    | Updated Koray Test Position 2 |