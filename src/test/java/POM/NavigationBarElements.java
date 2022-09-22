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

}
