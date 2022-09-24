Feature: Bank Accounts Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Bank Account
    And User create Bank Account with "<Name>" "<Iban>" "<Currency>" and "<IntegrationCode>"
    Then Success message should be displayed

    Examples:
    | Name                  | Iban                          | Currency | IntegrationCode |
    | Test Bank Account 1   | TR156876465468765468736465    | TRY      | TBA1            |
    | Test Bank Account 2   | TR378468735354354846546884    | USD      | TBA2            |


  Scenario Outline: Edit Bank Account
    And User edit Bank Account "<Name>" with "<UpdatedName>" "<UpdatedIban>" "<UpdatedCurrency>" and "<UpdatedIntegrationCode>"
    Then Success message should be displayed

    Examples:
    | Name                  | UpdatedName                  | UpdatedIban                   | UpdatedCurrency | UpdatedIntegrationCode |
    | Test Bank Account 1   | Updated Test Bank Account 1  | TR156876465468765468736465    | KZT             | TBA11                  |
    | Test Bank Account 2   | Updated Test Bank Account 2  | TR378468735354354846546884    | EUR             | TBA22                  |


   Scenario Outline: Delete Bank Account
    And User delete Bank Account "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                          |
    | Updated Test Bank Account 1   |
    | Updated Test Bank Account 2   |
