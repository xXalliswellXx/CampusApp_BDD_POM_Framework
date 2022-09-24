Feature: Document Types Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Document Type Test
    And User create Document Type with "<Name>" "<Stage>" "<Description>" "<Required>" "<Status>" and "<Camera>"
    Then Success message should be displayed

    Examples:
    | Name                     | Stage                               | Description                          | Required | Status | Camera |
    | Koray Test Document Type | Examination, Dismissal, Certificate | Koray Test Document Type Description | false    | true   | false  |



  Scenario Outline: Edit Document Type Test
    And User edit Document Type "<Name>" with "<UpdatedName>" "<UpdatedStage>" "<UpdatedDescription>" "<UpdatedRequired>" "<UpdatedStatus>" and "<UpdatedCamera>"
    Then Success message should be displayed


    Examples:
    Examples:
    | Name                     | UpdatedName                      | UpdatedStage                        | UpdatedDescription                   | UpdatedRequired | UpdatedStatus | UpdatedCamera |
    | Koray Test Document Type | Updated Koray Test Document Type | Contract, Employment, Certificate   | Koray Test Document Type Description | true            | true          | false         |



  Scenario Outline: Delete Document Type Test
    And User delete Document Type "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                             |
    | Updated Koray Test Document Type |
