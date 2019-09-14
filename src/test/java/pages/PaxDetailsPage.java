package pages;

import helper.SingletonDriver;
import locators.PaxDetailsObj;
import org.openqa.selenium.WebDriver;

public class PaxDetailsPage {

    WebDriver paxDetailsPageDriver;

    public PaxDetailsPage () {
        SingletonDriver singletonDriver = SingletonDriver.getSingletonDriver();
        this.paxDetailsPageDriver = singletonDriver.getLocalDriver();
    }

    public void clickOnGuestButton(){
        paxDetailsPageDriver.findElement(PaxDetailsObj.guestBookingButton).click();
    }

    public void continueWithPaxDetails(){
        paxDetailsPageDriver.findElement(PaxDetailsObj.firstNameTextBox).click();
    }
}
