Feature: To Test Go Ibibo Website

  @phpTravelTest
  Scenario Outline: To discover the low cost flight from a flight search

    Given The Test Data Sheet for GoIbibo Flight Ticket Search
      | phptestdata.xlsx |
      | phpTravel  |
    When The website is up and running
      | https://www.phptravels.net/ |
    When User enters the Origin "Origin" and destination "Destination" for a given TestCase "<TestCase>"
    Then Enter travel date and click on search button for a given TestCase "<TestCase>"
    Then Select the Book now button "<TestCase>"
    Then Click on the guest button and proceed with the booking
    Then Enter required passenger details for given "<TestCase>"

  Examples:
    | TestCase |
    | T1 |