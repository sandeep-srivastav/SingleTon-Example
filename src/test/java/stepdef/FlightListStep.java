package stepdef;

import cucumber.api.java.en.Then;
import pages.FlightListPage;

public class FlightListStep {

    FlightListPage flightListPage = new FlightListPage();

    @Then("^Select the Book now button \"([^\"]*)\"$")
    public void select_the_Book_now_button(String arg1) throws Throwable {
        flightListPage.selectFlight();
    }

}
