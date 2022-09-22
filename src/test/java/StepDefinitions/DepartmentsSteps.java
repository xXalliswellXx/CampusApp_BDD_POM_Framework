package StepDefinitions;

import POM.NavigationBarElements;
import POM.DialogContentElements;
import io.cucumber.java.en.And;

public class DepartmentsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Department with {string} and {string}")
    public void user_create_department_with(String departmentName, String code) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDepartmentsPage();
        dialogContentElements.createDepartment(departmentName, code);
    }

    @And("User edit Department {string} with {string} {string} and {string}")
    public void user_edit_department_with_and(String departmentName, String updatedDepartmentName,
                                              String updatedCode, String updatedStatus) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDepartmentsPage();
        dialogContentElements.editDepartment(departmentName, updatedDepartmentName, updatedCode, updatedStatus);
    }

    @And("User delete Department {string}")
    public void user_edit_department(String departmentName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDepartmentsPage();
        dialogContentElements.deleteDepartment(departmentName);
    }

}
