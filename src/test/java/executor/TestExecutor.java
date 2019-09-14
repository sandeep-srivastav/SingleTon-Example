package executor;

import com.relevantcodes.extentreports.ExtentReports;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.File;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdef"},
        tags = "@phpTravelTest",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:test-output/Test-Report/TestReport.html"
        }
)

public class TestExecutor extends AbstractTestNGCucumberTests {


    public static ExtentReports reports;

    @BeforeSuite
    public void readEnvDetails(){

        System.out.println("Scenario is ----------->  ");

    }
}