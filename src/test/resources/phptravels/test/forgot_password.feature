Feature: Forgot password
  As a user
  I would like to recover my password if I have forgotten
  So I can log in again and use the site

  Scenario: User is able to sign up with valid credentials
    Given I am on the sign up page
    When I enter my details
    And submit my signup request
    Then I am logged in
