package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class DiscountsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Discount with {string} {string} and {string}")
    public void user_create_discount_with_and(String description, String integrationCode, String priority) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDiscountsPage();
        dialogContentElements.createDiscount(description, integrationCode, priority);
    }

    @And("User edit Discount {string} with {string} {string} and {string}")
    public void user_edit_discount_with_and(String description,
                                            String updatedDescription, String updatedIntegrationCode, String updatedPriority) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDiscountsPage();
        dialogContentElements.editDiscount(description, updatedDescription, updatedIntegrationCode, updatedPriority);

    }

    @And("User delete Discount with {string}")
    public void user_edit_discount_with (String description) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDiscountsPage();
        dialogContentElements.deleteDiscount(description);
    }

}
