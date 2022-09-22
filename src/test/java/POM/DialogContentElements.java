package POM;

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

    @FindBy(css = "ms-save-button>button")
    private WebElement saveButton;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(), 'success')]")
    private WebElement successMessage;

    // ############# Functions  #############

    // #################### Nationality Test Functions Start ####################

    private void searchNationality(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        wait.until(ExpectedConditions.visibilityOf(searchNameInput));
        searchNameInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(searchButton);

        waitUntilTableHasOnlyOneElement();

    }

    public void createNationality(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        addButton.click();

        nameInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editNationality(String name, String updatedName) {

        searchNationality(name);

        editButton.click();

        nameInput.clear();
        nameInput.sendKeys(updatedName);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteNationality(String name) {

        searchNationality(name);

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Nationality Test Functions End ####################



    // #################### Discount Test Functions Start ####################

    private void searchDiscount(String description) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/discounts/list"));

        wait.until(ExpectedConditions.visibilityOf(searchDescriptionInput));
        searchDescriptionInput.sendKeys(description);

        waitUntilVisibleAndClickableThenClick(searchButton);

        waitUntilTableHasOnlyOneElement();

    }

    public void createDiscount(String description, String integrationCode, String priority) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/discounts/list"));

        addButton.click();

        descriptionInput.sendKeys(description);
        codeInput.sendKeys(integrationCode);
        priorityInput.sendKeys(priority);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void editDiscount(String description, String updatedDescription, String updatedIntegrationCode, String updatedPriority) {

        searchDiscount(description);

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

        searchDiscount(description);

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Discount Test Functions End ####################

    public void validateSuccessMessage() {

        wait.until(ExpectedConditions.visibilityOf(successMessage));

        Assert.assertTrue(successMessage.isDisplayed());

    }

}
