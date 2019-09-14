package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.InitializeBrowserSession;

import java.util.List;

public class HomepageStep {

    InitializeBrowserSession initializeBrowserSession = new InitializeBrowserSession();
    HomePage homePage = new HomePage();

    public String strWorkBookName = null;
    public String strSheetName= null;
    Boolean check = false;



    @Given("^The Test Data Sheet for GoIbibo Flight Ticket Search$")
    public void the_Test_Data_Sheet_for_GoIbibo_Flight_Ticket_Search(List<String> data) throws Throwable {
        this.strWorkBookName = data.get(0);
        this.strSheetName = data.get(1);
        System.out.println(strWorkBookName + "=====" + strSheetName);
    }

    @When("^The website is up and running$")
    public void the_website_is_up_and_running(List<String> url) throws Throwable {
        String strUrlValue = url.get(0);
        initializeBrowserSession.openWebPage(strUrlValue);
    }

    @When("^User enters the Origin \"([^\"]*)\" and destination \"([^\"]*)\" for a given TestCase \"([^\"]*)\"$")
    public void user_enters_the_Origin_and_destination_for_a_given_TestCase(String strOrigin, String strDestination,
                                    String testcase) throws Throwable {
        homePage.searchFlight(strWorkBookName, strSheetName, testcase, strOrigin, strDestination);
    }

    @Then("^Enter travel date and click on search button for a given TestCase \"([^\"]*)\"$")
    public void enter_travel_date_and_click_on_search_button_for_a_given_TestCase(String arg1) throws Throwable {
        homePage.enterTravelDate();
    }

}
