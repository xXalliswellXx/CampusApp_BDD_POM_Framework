package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class GradeLevelsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Grade Level with {string} {string} and {string}")
    public void user_create_grade_level_with_and(String name, String shortName, String order) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToGradeLevelsPage();
        dialogContentElements.createGradeLevel(name, shortName, order);
    }

    @And("User edit Grade Level {string} with {string} {string} and {string}")
    public void user_edit_grade_level_with_and(String name, String updatedName, String updatedShortName, String updatedOrder) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToGradeLevelsPage();
        dialogContentElements.editGradeLevel(name, updatedName, updatedShortName, updatedOrder);
    }

    @And("User delete Grade Level with {string}")
    public void user_delete_grade_level_with(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToGradeLevelsPage();
        dialogContentElements.deleteGradeLevel(name);
    }

}
