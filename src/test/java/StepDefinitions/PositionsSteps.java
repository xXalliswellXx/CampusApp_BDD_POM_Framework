package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class PositionsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Position with {string} {string} and {string}")
    public void user_create_position_with_and(String name, String shortName, String status) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionsPage();
        dialogContentElements.createPosition(name, shortName, status);

    }

    @And("User edit Position {string} with {string} {string} and {string}")
    public void user_edit_position_with_and(String name, String updatedName,String updatedShortName, String updatedStatus) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionsPage();
        dialogContentElements.editPosition(name, updatedName, updatedShortName, updatedStatus);
    }

    @And("User delete Position {string}")
    public void user_delete_position(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToPositionsPage();
        dialogContentElements.deletePosition(name);
    }

}
