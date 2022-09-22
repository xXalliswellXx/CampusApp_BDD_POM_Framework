package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM {

    // ############# Constructor  #############

    public NavigationBarElements() {
        PageFactory.initElements(driver, this);
    }


    // ############# Web Elements  #############

    @FindBy(xpath = "(//span[text()='Setup'])[1]/..")
    private WebElement setupLink;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]/..")
    private WebElement parametersLink;

    @FindBy(xpath = "//span[text()='Nationalities']/..")
    private WebElement nationalitiesLink;

    @FindBy(xpath = "//span[text()='Discounts']/..")
    private WebElement discountsLink;

    @FindBy(xpath = "//span[text()='Grade Levels']/..")
    private WebElement gradeLevelsLink;

    @FindBy(xpath = "//span[text()='Bank Accounts']/..")
    private WebElement bankAccountsLink;

    @FindBy(xpath = "//span[text()='School Setup']/..")
    private WebElement schoolSetupLink;

    @FindBy(xpath = "//span[text()='Departments']/..")
    private WebElement departmentsLink;

    // ############# Functions  #############

    public void navigateToNationalitiesPage() {

        waitUntilVisibleAndClickableThenClick(setupLink);
        waitUntilVisibleAndClickableThenClick(parametersLink);
        waitUntilVisibleAndClickableThenClick(nationalitiesLink);

    }

    public void navigateToDiscountsPage() {

        waitUntilVisibleAndClickableThenClick(setupLink);
        waitUntilVisibleAndClickableThenClick(parametersLink);
        waitUntilVisibleAndClickableThenClick(discountsLink);

    }

    public void navigateToGradeLevelsPage() {

        waitUntilVisibleAndClickableThenClick(setupLink);
        waitUntilVisibleAndClickableThenClick(parametersLink);
        waitUntilVisibleAndClickableThenClick(gradeLevelsLink);

    }

    public void navigateToBankAccountsPage() {
        waitUntilVisibleAndClickableThenClick(setupLink);
        waitUntilVisibleAndClickableThenClick(parametersLink);
        waitUntilVisibleAndClickableThenClick(bankAccountsLink);
    }

    public void navigateToDepartmentsPage() {
        waitUntilVisibleAndClickableThenClick(setupLink);
        waitUntilVisibleAndClickableThenClick(schoolSetupLink);
        waitUntilVisibleAndClickableThenClick(departmentsLink);
    }

}
