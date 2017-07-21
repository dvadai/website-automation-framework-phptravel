Feature: Sign up
  As a user
  I would like to sign up
  So I can use the site

  Scenario: User is able to sign up with valid credentials
    Given I am on the sign up page
    When I enter my details
    And submit my signup request
    Then I am logged in
