Feature: Flight booking
  As a user
  I would like to search for flights
  So I can book my selection

  @sanity @flightbooking
  Scenario: User is able to book a flight details when not logged in
    TBC

  @sanity @flightbooking
  Scenario: User is able to book a flight details when logged in
    Given I am on the flights booking page as a returning user
    And I enter valid booking details
    When I submit my search request
    Then the results will be displayed on the flights page
    And I can click on book on any of the results
    And I will be navigated the the booking page
    When I submit my details
    And submit payment for the booking
    Then I have a completed my booking

  @smoke @flightbooking
  Scenario: User is able to book a flight details with child and infant passengers
    Given I am on the flights booking page as a returning user
    And I enter the following parameters
      | origin | destination | depart_date | return_date | number_of_adult_passengers | number_of_child_assengers | number_of_infant_assengers |
      | London | Budapest    | rndm_date   | rndm_date   | 1                          | 1                         | 1                          |
    When I submit my search request
    Then the results will be displayed on the flights page
    And I can click on book on any of the results
    And I will be navigated the the booking page
    When I submit my details
    And submit payment for the booking
    Then I have a completed my booking