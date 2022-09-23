Feature: Locations Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Location Test
    And User create Location with "<Name>" "<ShortName>" "<Type>" "<Capacity>" and "<Status>"
    Then Success message should be displayed

    Examples:
    | Name                  | ShortName | Type          | Capacity | Status |
    | Koray Test Location 1 | KTL1      | Classroom     | 50       | true   |
    | Koray Test Location 2 | KTL2      | Laboratory    | 27       | false  |
    | Koray Test Location 3 | KTL3      | Other         | 100      | true   |


  Scenario Outline: Edit Location Test
    And User edit Location "<Name>" with "<UpdatedName>" "<UpdatedShortName>" "<UpdatedType>" "<UpdatedCapacity>" and "<UpdatedStatus>"
    Then Success message should be displayed

    Examples:
    | Name                  | UpdatedName                   | UpdatedShortName | UpdatedType   | UpdatedCapacity | UpdatedStatus |
    | Koray Test Location 1 | Updated Koray Test Location 1 | UKTL1            | Laboratory    | 75              | false         |
    | Koray Test Location 2 | Updated Koray Test Location 2 | UKTL2            | Other         | 37              | true          |
    | Koray Test Location 3 | Updated Koray Test Location 3 | UKTL3            | Classroom     | 40              | false         |


  Scenario Outline: Delete Location Test
    And User delete Location "<Name>"
    Then Success message should be displayed

    Examples:
    | Name                          |
    | Updated Koray Test Location 1 |
    | Updated Koray Test Location 2 |
    | Updated Koray Test Location 3 |
