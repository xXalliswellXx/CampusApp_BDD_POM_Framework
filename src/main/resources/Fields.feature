Feature: Fields Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Field Test
    And User create Field with "<Name>" "<Code>" and "<FieldType>"
    Then Success message should be displayed

    Examples:
    | Name               | Code  | FieldType       |
    | Koray Test Field 1 | KTF1  | Text            |
    | Koray Test Field 2 | KTF2  | Integer         |


  Scenario Outline: Edit Field Test
    And User edit Field "<Name>" with "<UpdatedName>" and "<UpdatedCode>"
    Then Success message should be displayed

    Examples:
    | Name               | UpdatedName                | UpdatedCode |
    | Koray Test Field 1 | Updated Koray Test Field 1 | UKTF1       |
    | Koray Test Field 2 | Updated Koray Test Field 2 | UKTF2       |


  Scenario Outline: Delete Field Test
    And User delete Field "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                       |
    | Updated Koray Test Field 1 |
    | Updated Koray Test Field 2 |
