package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class SubjectCategoriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Subject Category with {string} {string} and {string}")
    public void user_create_subject_category_with(String name, String code, String status) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToSubjectCategoriesPage();
        dialogContentElements.createSubjectCategory(name, code, status);
    }

    @And("User edit Subject Category {string} with {string} {string} and {string}")
    public void user_edit_subject_category_with(String name, String updatedName, String updatedCode, String updatedStatus) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToSubjectCategoriesPage();
        dialogContentElements.editSubjectCategory(name, updatedName, updatedCode, updatedStatus);
    }

    @And("User delete Subject Category {string}")
    public void user_delete_subject_category(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToSubjectCategoriesPage();
        dialogContentElements.deleteSubjectCategory(name);
    }

}
