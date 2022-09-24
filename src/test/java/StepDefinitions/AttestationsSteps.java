package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class AttestationsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User add Attestation with {string}")
    public void user_add_attestation_with(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToAttestationsPage();
        dialogContentElements.createAttestation(name);
    }

    @And("User edit Attestation {string} with {string}")
    public void user_edit_attestation_with(String name, String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToAttestationsPage();
        dialogContentElements.editAttestation(name, updatedName);
    }

    @And("User delete Attestation {string}")
    public void user_delete_attestation(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToAttestationsPage();
        dialogContentElements.deleteAttestation(name);
    }

}
