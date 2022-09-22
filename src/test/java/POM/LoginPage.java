package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePOM{

    // ############# Constructor  #############

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    // ############# Web Elements  #############

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameInput;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(css = "form>button")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()=' Dashboard ']")
    private WebElement dashboardText;


    // ############# Functions  #############

    private String username = "richfield.edu", password = "Richfield2020!";

    public void validateUserOnLoginPage() {

        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());

    }

    public void userEnterAdminCredentials() {

        waitUntilVisibleAndClickableThenClick(acceptCookiesButton);

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    public void validateUserLoggedInSuccessfully() {

        wait.until(ExpectedConditions.visibilityOf(dashboardText));

        Assert.assertTrue(dashboardText.isDisplayed());

    }

}
