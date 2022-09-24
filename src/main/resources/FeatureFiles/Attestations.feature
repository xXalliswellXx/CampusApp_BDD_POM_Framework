Feature: Attestations Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Attestation Test
    And User add Attestation with "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                   |
    | Koray Test Attestation |

  Scenario Outline: Edit Attestation Test
    And User edit Attestation "<Name>" with "<UpdatedName>"
    Then Success message should be displayed

    Examples:
    | Name                   | UpdatedName                    |
    | Koray Test Attestation | Updated Koray Test Attestation |


  Scenario Outline: Delete Attestation Test
    And User delete Attestation "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                           |
    | Updated Koray Test Attestation |
