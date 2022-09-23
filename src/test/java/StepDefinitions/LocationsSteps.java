package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class LocationsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Location with {string} {string} {string} {string} and {string}")
    public void user_create_location_with_and(String name, String shortName, String type, String capacity, String status) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToLocationsPage();
        dialogContentElements.createLocation(name, shortName, type, capacity, status);
    }

    @And("User edit Location {string} with {string} {string} {string} {string} and {string}")
    public void user_edit_location_with_and(String name,String updatedName, String updatedShortName,
                                            String updatedType, String updatedCapacity, String updatedStatus) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToLocationsPage();
        dialogContentElements.editLocation(name, updatedName, updatedShortName, updatedType, updatedCapacity, updatedStatus);
    }

    @And("User delete Location {string}")
    public void user_delete_location(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToLocationsPage();
        dialogContentElements.deleteLocation(name);
    }

}
