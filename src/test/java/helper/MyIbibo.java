package helper;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdef"},
        tags = "@goibiboTesting",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:test-output/HPP-Test-Report/TestReport.html"
        }
)

public class MyIbibo extends AbstractTestNGCucumberTests  {


//extends AbstractTestNGCucumberTests
        @BeforeTest
        public void isItWorking(){
                System.out.println("Just to check if @beforetest is getting called !!! ");
        }

}
