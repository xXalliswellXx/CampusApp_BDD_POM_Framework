Feature: Discounts Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Discount Test
    And User create Discount with "<Description>" "<IntegrationCode>" and "<Priority>"
    Then Success message should be displayed

    Examples:
    | Description             | IntegrationCode  | Priority  |
    | Koray Test Discount 1   | KTD1             | 123456    |
    | Koray Test Discount 2   | KTD2             | 456789    |


  Scenario Outline: Edit Discount Test
    And User edit Discount "<Description>" with "<UpdatedDescription>" "<UpdatedIntegrationCode>" and "<UpdatedPriority>"
    Then Success message should be displayed

    Examples:
    | Description             |  UpdatedDescription            | UpdatedIntegrationCode| UpdatedPriority |
    | Koray Test Discount 1   |  Updated Koray Test Discount 1 | UKTD1                 | 1234567         |
    | Koray Test Discount 2   |  Updated Koray Test Discount 2 | UKTD2                 | 4567890         |


  Scenario Outline: Delete Discount Test
    And User delete Discount with "<Description>"
    Then Success message should be displayed

    Examples:
    |  Description                   |
    |  Updated Koray Test Discount 1 |
    |  Updated Koray Test Discount 2 |
