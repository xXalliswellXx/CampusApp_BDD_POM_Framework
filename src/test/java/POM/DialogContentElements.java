package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM {

    // ############# Constructor  #############

    public DialogContentElements() {
        PageFactory.initElements(driver, this);
    }

    // ############# Web Elements  #############

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.NAME']>input")
    private WebElement searchNameInput;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.CODE']>input")
    private WebElement searchCodeInput;

    @FindBy(css = "ms-text-field[placeholder='DISCOUNT.TITLE.DESCRIPTION']>input")
    private WebElement searchDescriptionInput;

    @FindBy(css = "ms-search-button>div>button")
    private WebElement searchButton;

    @FindBy(css = "ms-add-button>div>button")
    private WebElement addButton;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement nameInput;

    @FindBy(css = "ms-text-field[formcontrolname='description']>input")
    private WebElement descriptionInput;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement codeInput;

    @FindBy(css = "ms-integer-field>input")
    private WebElement priorityInput;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement shortNameInput;

    @FindBy(css = "ms-text-field[formcontrolname='order']>input")
    private WebElement orderInput;

    @FindBy(css = "ms-masked-text-field[formcontrolname='iban']>input")
    private WebElement ibanInput;

    @FindBy(css = "mat-select[formcontrolname='currency']")
    private WebElement currencyDropdown;

    @FindBy(css = "ms-text-field[formcontrolname='integrationCode']>input")
    private WebElement integrationCodeInput;

    @FindBy(css = "ms-save-button>button")
    private WebElement saveButton;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(), 'success')]")
    private WebElement successMessage;

    @FindBy(css = "mat-slide-toggle[formcontrolname='active']>label>span")
    private WebElement statusSwitch;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement typeComboBox;

    @FindBy(css = "ms-integer-field[placeholder='GENERAL.FIELD.CAPACITY']>input")
    private WebElement capacityInput;

    @FindBy(css = "mat-progress-bar[role='progressbar']")
    private WebElement progressBar;

    @FindBy(css = "mat-select[role='combobox']")
    private WebElement searchComboBox;

    // ############# Functions  #############

    // #################### Nationality Test Functions Start ####################

    public void createNationality(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        addButton.click();

        nameInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editNationality(String name, String updatedName) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        searchElement(name, searchNameInput, searchButton);

        editButton.click();

        nameInput.clear();
        nameInput.sendKeys(updatedName);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteNationality(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        searchElement(name, searchNameInput, searchButton);

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Nationality Test Functions End ####################



    // #################### Discount Test Functions Start ####################

    public void createDiscount(String description, String integrationCode, String priority) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/discounts/list"));

        addButton.click();

        descriptionInput.sendKeys(description);
        codeInput.sendKeys(integrationCode);
        priorityInput.sendKeys(priority);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editDiscount(String description, String updatedDescription, String updatedIntegrationCode, String updatedPriority) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/discounts/list"));

        searchElement(description, searchDescriptionInput, searchButton);

        editButton.click();

        descriptionInput.clear();
        descriptionInput.sendKeys(updatedDescription);
        codeInput.clear();
        codeInput.sendKeys(updatedIntegrationCode);
        priorityInput.clear();
        priorityInput.sendKeys(updatedPriority);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteDiscount(String description) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/discounts/list"));

        searchElement(description, searchDescriptionInput, searchButton);

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Discount Test Functions End ####################



    // #################### Grade Level Test Functions Start ####################


    public void createGradeLevel(String name, String shortName, String order) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/grade-level"));

        addButton.click();

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);
        orderInput.sendKeys(order);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editGradeLevel(String name, String updatedName, String updatedShortName, String updatedOrder) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/grade-level"));

        searchFromTable(name, "edit");

        nameInput.clear();
        nameInput.sendKeys(updatedName);
        shortNameInput.clear();
        shortNameInput.sendKeys(updatedShortName);
        orderInput.clear();
        orderInput.sendKeys(updatedOrder);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteGradeLevel(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/grade-level"));

        searchFromTable(name, "delete");

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Grade Level Test Functions End ####################



    // #################### Bank Account Test Functions Start ####################

    public void createBankAccount(String name, String iban, String currency, String integrationCode) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/bank-account/list"));

        addButton.click();

        nameInput.sendKeys(name);
        ibanInput.sendKeys(iban);
        integrationCodeInput.sendKeys(integrationCode);

        selectFromDropdown(currency, currencyDropdown);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editBankAccount(String name, String updatedName,
                                  String updatedIban, String updatedCurrency, String updatedIntegrationCode) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/bank-account/list"));

        searchElement(name, searchNameInput, searchButton);

        editButton.click();

        wait.until(ExpectedConditions.visibilityOf(nameInput));
        nameInput.clear();
        nameInput.sendKeys(updatedName);
        ibanInput.clear();
        ibanInput.sendKeys(updatedIban);
        integrationCodeInput.sendKeys(updatedIntegrationCode);

        selectFromDropdown(updatedCurrency, currencyDropdown);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteBankAccount(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/bank-account/list"));

        searchElement(name,  searchNameInput, searchButton);

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }


    // #################### Bank Account Test Functions End ####################


    // #################### Departments Test Functions Start ####################

    public void createDepartment(String departmentName, String code) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-department"));

        addButton.click();

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.sendKeys(departmentName);
        codeInput.sendKeys(code);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editDepartment(String departmentName, String updatedDepartmentName, String updatedCode, String updatedStatus) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-department"));

        wait.until(ExpectedConditions.elementToBeClickable(searchComboBox));

        waitUntilVisibleAndClickableThenClick(searchButton);

        wait.until(ExpectedConditions.invisibilityOf(progressBar));

        searchFromTable(departmentName, "edit");

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.clear();
        nameInput.sendKeys(updatedDepartmentName);

        codeInput.clear();
        codeInput.sendKeys(updatedCode);

        changeStatus(updatedStatus, statusSwitch);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteDepartment(String departmentName) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-department"));

        wait.until(ExpectedConditions.elementToBeClickable(searchComboBox));

        waitUntilVisibleAndClickableThenClick(searchButton);

        wait.until(ExpectedConditions.invisibilityOf(progressBar));

        searchFromTable(departmentName, "delete");

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Departments Test Functions End ####################

    // #################### Locations Test Functions Start ####################

    public void createLocation(String name, String shortName, String type, String capacity, String status) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-location"));

        selectFromDropdown("Campus Project", searchComboBox);

        addButton.click();

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);

        selectFromDropdown(type, typeComboBox);

        changeStatus(status, statusSwitch);

        capacityInput.sendKeys(capacity);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editLocation(String name,String updatedName, String updatedShortName,
                              String updatedType, String updatedCapacity, String updatedStatus) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-location"));

        selectFromDropdown("Campus Project", searchComboBox);

        waitUntilVisibleAndClickableThenClick(searchButton);

        wait.until(ExpectedConditions.invisibilityOf(progressBar));

        searchFromTable(name, "edit");

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.clear();
        nameInput.sendKeys(updatedName);
        shortNameInput.clear();
        shortNameInput.sendKeys(updatedShortName);

        selectFromDropdown(updatedType, typeComboBox);

        changeStatus(updatedStatus, statusSwitch);

        capacityInput.clear();
        capacityInput.sendKeys(updatedCapacity);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteLocation(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/school-location"));

        selectFromDropdown("Campus Project", searchComboBox);

        waitUntilVisibleAndClickableThenClick(searchButton);

        wait.until(ExpectedConditions.invisibilityOf(progressBar));

        searchFromTable(name, "delete");

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Locations Test Functions End ####################

    // #################### Subject Categories Test Functions Start ####################

    public void createSubjectCategory(String name, String code, String status) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/subject-categories/list"));

        addButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(nameInput));

        nameInput.sendKeys(name);
        codeInput.sendKeys(code);

        changeStatus(status, statusSwitch);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editSubjectCategory(String name, String updatedName, String updatedCode, String updatedStatus) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/subject-categories/list"));

        searchElement(name, searchNameInput, searchButton);

        waitUntilVisibleAndClickableThenClick(editButton);

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.clear();
        nameInput.sendKeys(updatedName);
        codeInput.clear();
        codeInput.sendKeys(updatedCode);

        changeStatus(updatedStatus, statusSwitch);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteSubjectCategory(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/subject-categories/list"));

        searchElement(name, searchNameInput, searchButton);

        waitUntilVisibleAndClickableThenClick(deleteButton);

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Subject Categories Test Functions Start ####################

    // #################### Positions Test Functions Start ####################

    public void createPosition(String name, String shortName, String status) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/employee-position"));

        addButton.click();

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);

        changeStatus(status, statusSwitch);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editPosition(String name, String updatedName,String updatedShortName, String updatedStatus) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/employee-position"));

        searchElement(name, searchNameInput, searchButton);

        waitUntilVisibleAndClickableThenClick(editButton);

        wait.until(ExpectedConditions.visibilityOf(nameInput));

        nameInput.clear();
        nameInput.sendKeys(updatedName);
        shortNameInput.clear();
        shortNameInput.sendKeys(updatedShortName);

        changeStatus(updatedStatus, statusSwitch);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deletePosition(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/employee-position"));

        searchElement(name, searchNameInput, searchButton);

        waitUntilVisibleAndClickableThenClick(deleteButton);

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Positions Test Functions End ####################

    public void validateSuccessMessage() {

        wait.until(ExpectedConditions.visibilityOf(successMessage));

        Assert.assertTrue(successMessage.isDisplayed());

    }

}
