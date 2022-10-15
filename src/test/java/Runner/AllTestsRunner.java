package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/report/AllTests.html"}
)

public class AllTestsRunner extends AbstractTestNGCucumberTests {}
