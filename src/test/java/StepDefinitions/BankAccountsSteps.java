package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class BankAccountsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Bank Account with {string} {string} {string} and {string}")
    public void user_create_bank_account_with_and(String name, String iban, String currency, String integrationCode) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToBankAccountsPage();
        dialogContentElements.createBankAccount(name, iban, currency, integrationCode);
    }

    @And("User edit Bank Account {string} with {string} {string} {string} and {string}")
    public void user_edit_bank_account_with_and(String name, String updatedName,
                                                  String updatedIban, String updatedCurrency, String updatedIntegrationCode) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToBankAccountsPage();
        dialogContentElements.editBankAccount(name, updatedName, updatedIban, updatedCurrency, updatedIntegrationCode);
    }

    @And("User delete Bank Account {string}")
    public void user_delete_bank_account_test_bank_account(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToBankAccountsPage();
        dialogContentElements.deleteBankAccount(name);
    }

}
