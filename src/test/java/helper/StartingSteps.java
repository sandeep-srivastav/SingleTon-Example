package helper;

import cucumber.api.java.Before;
import org.testng.annotations.BeforeTest;

public class StartingSteps {

    @Before("@goibiboTesting")
    public void isItWorking(){
        System.out.println("ABCD     !!! ");
    }
}
