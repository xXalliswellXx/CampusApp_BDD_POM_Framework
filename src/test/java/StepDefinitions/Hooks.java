package StepDefinitions;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void setup() {

        driver.get("https://demo.mersys.io/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot screenshot = ((TakesScreenshot) driver);

            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            String scenarioName = scenario.getName();

            File destinationFile = new File("target/FailedScreenshots/" + scenarioName + ".png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        Driver.quitDriver();

    }

}
