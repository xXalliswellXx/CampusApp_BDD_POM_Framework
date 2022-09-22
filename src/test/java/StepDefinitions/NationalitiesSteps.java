package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NationalitiesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Nationality with {string}")
    public void user_create_nationality_with(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToNationalitiesPage();
        dialogContentElements.createNationality(name);
    }

    @And("User edit Nationality {string} with {string}")
    public void user_edit_nationality_with(String name, String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToNationalitiesPage();
        dialogContentElements.editNationality(name, updatedName);
    }

    @And("User delete Nationality {string}")
    public void user_delete_nationality(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToNationalitiesPage();
        dialogContentElements.deleteNationality(name);
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements = new DialogContentElements();

        dialogContentElements.validateSuccessMessage();
    }

}
