Feature: Departments Functionality

  Background: Login Function
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Department Test
    And User create Department with "<DepartmentName>" and "<Code>"
    Then Success message should be displayed

    Examples:
    | DepartmentName                  | Code  |
    | Koray Test Department           | KTD   |


  Scenario Outline: Edit Department Test
    And User edit Department "<DepartmentName>" with "<UpdatedDepartmentName>" "<UpdatedCode>" and "<UpdatedStatus>"
    Then Success message should be displayed

    Examples:
    | DepartmentName                  | UpdatedDepartmentName           | UpdatedCode | UpdatedStatus |
    | Koray Test Department           | Updated Koray Test Department   | UKTD        | false         |


  Scenario Outline: Delete Department Test
    And User delete Department "<DepartmentName>"
    Then Success message should be displayed

    Examples:
    | DepartmentName                  |
    | Updated Koray Test Department   |