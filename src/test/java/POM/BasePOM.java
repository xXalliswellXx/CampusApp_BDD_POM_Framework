package POM;

import Utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class BasePOM {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void waitUntilVisibleAndClickableThenClick(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }

    public void waitUntilTableHasOnlyOneElement() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody>tr"), 1));
    }

    public void searchElement(String name, WebElement searchInput, WebElement searchButton) {

        wait.until(ExpectedConditions.visibilityOf(searchInput));
        searchInput.sendKeys(name);

        waitUntilVisibleAndClickableThenClick(searchButton);

        waitUntilTableHasOnlyOneElement();

    }

    // If there is no search functionality in the page
    // this function will search and click edit or delete button for specific data
    public void searchFromTable(String name, String action) {

        List<WebElement> tableRows = driver.findElements(By.cssSelector("tbody>tr"));

        WebElement button;

        for (WebElement row : tableRows) {

            List<WebElement> cells = row.findElements(By.cssSelector("td"));

            if (cells.get(1).getText().equals(name) && action.equals("edit")) {
                button = cells.get(cells.size() - 1).findElement(By.cssSelector("ms-edit-button>button"));
                waitUntilVisibleAndClickableThenClick(button);
            } else if (cells.get(1).getText().equals(name) && action.equals("delete")){
                button = cells.get(cells.size() - 1).findElement(By.cssSelector("ms-delete-button>button"));
                waitUntilVisibleAndClickableThenClick(button);
            }
        }

    }

    public void selectFromDropdown(String selection, WebElement elementToClick) {

        waitUntilVisibleAndClickableThenClick(elementToClick);

        List<WebElement> elementList = driver.findElements(By.cssSelector("mat-option>span"));

        for (WebElement element : elementList) {
            if (element.getText().contains(selection))
                waitUntilVisibleAndClickableThenClick(element);
        }

    }

    public void multipleSelectFromDropdown(String[] selections, WebElement elementToClick) {

        waitUntilVisibleAndClickableThenClick(elementToClick);

        List<WebElement> elementList = driver.findElements(By.cssSelector("mat-option>span"));

        List<WebElement> checkBoxList = driver.findElements(By.cssSelector("mat-option[role='option']"));

        for (int i = 0; i < elementList.size(); i++) {

            for (String selection : selections) {

                if (elementList.get(i).getText().equals(selection) && checkBoxList.get(i).getAttribute("aria-selected").equals("false")) {
                    elementList.get(i).click();
                    break;
                } else if (checkBoxList.get(i).getAttribute("aria-selected").equals("true"))
                    elementList.get(i).click();

            }


        }

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException ignore) {}

    }

    public void tryNavigateToPage(WebElement first, WebElement second, WebElement third) {

        try {
            waitUntilVisibleAndClickableThenClick(first);
            waitUntilVisibleAndClickableThenClick(second);
            waitUntilVisibleAndClickableThenClick(third);
        } catch (StaleElementReferenceException ex) {
            waitUntilVisibleAndClickableThenClick(first);
            waitUntilVisibleAndClickableThenClick(second);
            waitUntilVisibleAndClickableThenClick(third);
        }

    }

    public void changeStatus(String status, WebElement statusSwitch) {

        if (!statusSwitch.findElement(By.cssSelector("input")).getAttribute("aria-checked").equals(status)) {
            statusSwitch.click();
        }

    }

}
