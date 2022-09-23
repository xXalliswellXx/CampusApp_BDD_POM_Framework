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

    @FindBy(xpath = "//span[text()='Locations']/..")
    private WebElement locationsLink;

    @FindBy(xpath = "//span[text()='Education']/..")
    private WebElement educationLink;

    @FindBy(xpath = "(//span[text()='Setup'])[4]/..")
    private WebElement setupLinkUnderEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']/..")
    private WebElement subjectCategoriesLink;

    @FindBy(xpath = "//span[text()='Human Resources']/..")
    private WebElement humanResourcesLink;

    @FindBy(xpath = "(//span[text()='Setup'])[3]/..")
    private WebElement setupLinkUnderHumanResources;

    @FindBy(xpath = "//span[text()='Positions']/..")
    private WebElement positionsLink;

    // ############# Functions  #############

    public void navigateToNationalitiesPage() {

        tryNavigateToPage(setupLink, parametersLink, nationalitiesLink);

    }

    public void navigateToDiscountsPage() {

        tryNavigateToPage(setupLink, parametersLink, discountsLink);

    }

    public void navigateToGradeLevelsPage() {

        tryNavigateToPage(setupLink, parametersLink, gradeLevelsLink);

    }

    public void navigateToBankAccountsPage() {

        tryNavigateToPage(setupLink, parametersLink, bankAccountsLink);

    }

    public void navigateToDepartmentsPage() {

        tryNavigateToPage(setupLink, schoolSetupLink, departmentsLink);

    }

    public void navigateToLocationsPage() {

        tryNavigateToPage(setupLink, schoolSetupLink, locationsLink);

    }

    public void navigateToSubjectCategoriesPage() {

        tryNavigateToPage(educationLink, setupLinkUnderEducation, subjectCategoriesLink);

    }

    public void navigateToPositionsPage() {

        tryNavigateToPage(humanResourcesLink, setupLinkUnderHumanResources, positionsLink);

    }

}
