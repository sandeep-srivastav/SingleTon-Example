package pages;

import locators.FlightListPageObj;
import helper.SingletonDriver;
import org.openqa.selenium.WebDriver;

public class FlightListPage {

    WebDriver flightlistPageDriver;

    public FlightListPage(){
        SingletonDriver singletonDriver = SingletonDriver.getSingletonDriver();
        this.flightlistPageDriver = singletonDriver.getLocalDriver();
    }

    public void selectFlight() throws InterruptedException {
        Thread.sleep(4000);
        flightlistPageDriver.findElement(FlightListPageObj.selectFlightBtn).click();
        Thread.sleep(4000);
    }
}
