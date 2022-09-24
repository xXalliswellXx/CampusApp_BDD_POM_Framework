package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class DocumentTypesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Document Type with {string} {string} {string} {string} {string} and {string}")
    public void user_create_document_type_with_and(String name, String stage, String description,
                                                   String required, String status, String camera) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDocumentTypesPage();
        dialogContentElements.createDocumentType(name, stage, description, required, status, camera);

    }

    @And("User edit Document Type {string} with {string} {string} {string} {string} {string} and {string}")
    public void user_edit_document_type_with_and(String name, String updatedName,String updatedStage, String updatedDescription,
                                                   String updatedRequired, String updatedStatus, String updatedCamera) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDocumentTypesPage();
        dialogContentElements.editDocumentType(name, updatedName, updatedStage, updatedDescription, updatedRequired, updatedStatus, updatedCamera);

    }

    @And("User delete Document Type {string}")
    public void user_delete_document_type(String name) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToDocumentTypesPage();
        dialogContentElements.deleteDocumentType(name);

    }

}
