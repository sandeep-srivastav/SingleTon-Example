package stepdef;

import cucumber.api.java.en.Then;
import pages.PaxDetailsPage;

public class PaxDetailsStep {

    PaxDetailsPage paxDetailsPage = new PaxDetailsPage();

    @Then("^Click on the guest button and proceed with the booking$")
    public void click_on_the_guest_button_and_proceed_with_the_booking() throws Throwable {
        paxDetailsPage.clickOnGuestButton();
    }

    @Then("^Enter required passenger details for given \"([^\"]*)\"$")
    public void enter_required_passenger_details_for_given(String arg1) throws Throwable {
        paxDetailsPage.continueWithPaxDetails();
    }
}
