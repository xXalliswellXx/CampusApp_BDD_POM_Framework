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

    @FindBy(css = "ms-save-button>button")
    private WebElement saveButton;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(), 'success')]")
    private WebElement successMessage;

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

        wait.until(ExpectedConditions.visibilityOf(searchNameInput));
        searchNameInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(searchButton);

        waitUntilTableHasOnlyOneElement();

        editButton.click();

        nameInput.clear();
        nameInput.sendKeys(updatedName);

        waitUntilVisibleAndClickableThenClick(saveButton);

    }

    public void deleteNationality(String name) {

        wait.until(ExpectedConditions.urlToBe("https://demo.mersys.io/nationality/list"));

        wait.until(ExpectedConditions.visibilityOf(searchNameInput));
        searchNameInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(searchButton);

        waitUntilTableHasOnlyOneElement();

        deleteButton.click();

        waitUntilVisibleAndClickableThenClick(submitButton);

    }

    // #################### Nationality Test Functions End ####################

    public void validateSuccessMessage() {

        wait.until(ExpectedConditions.visibilityOf(successMessage));

        Assert.assertTrue(successMessage.isDisplayed());

    }

}
