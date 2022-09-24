package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class FieldsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Field with {string} {string} and {string}")
    public void user_create_field_with_and(String name, String code, String fieldType) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFieldsPage();
        dialogContentElements.createField(name, code, fieldType);
    }

    @And("User edit Field {string} with {string} and {string}")
    public void user_edit_field_with_and(String name, String updatedName, String updatedCode) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFieldsPage();
        dialogContentElements.editField(name,updatedName,updatedCode);
    }

    @And("User delete Field {string}")
    public void user_delete_field(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFieldsPage();
        dialogContentElements.deleteField(name);
    }

}
