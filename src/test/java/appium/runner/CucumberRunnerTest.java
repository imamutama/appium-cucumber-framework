package appium.runner;

import appium.capabilities.DriverFactoryManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/java/appium/features"},
        glue = "appium.stepdef",
        plugin = {
                "pretty",
                "html:target/cucumber/report.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
        })

public class CucumberRunnerTest {

    @BeforeClass
    public static void tearUp() {
        DriverFactoryManager.startDriverByMavenParameter(System.getProperty("environment"));
    }

    @AfterClass
    public static void tearDown() {
        DriverFactoryManager.quitDriver();
    }

}