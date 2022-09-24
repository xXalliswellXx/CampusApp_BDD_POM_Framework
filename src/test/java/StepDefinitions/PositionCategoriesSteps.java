package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class PositionCategoriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User add Position Category with {string}")
    public void user_add_position_category_with(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionCategoriesPage();
        dialogContentElements.createPositionCategories(name);
    }

    @And("User edit Position Category {string} with {string}")
    public void user_edit_position_category_with(String name, String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionCategoriesPage();
        dialogContentElements.editPositionCategories(name, updatedName);
    }

    @And("User delete Position Category {string}")
    public void user_delete_position_category(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionCategoriesPage();
        dialogContentElements.deletePositionCategories(name);
    }

}
