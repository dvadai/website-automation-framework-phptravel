Feature: Login
  As a user
  I would like to log in
  So I can use the site

  @smoke
  Scenario: User is able to log in with valid credentials
    Given I am on the front page
    When I enter my login details
    And submit my login request
    Then I am logged in

  @smoke
  Scenario: User is unable to log in with invalid credentials
    Given I am on the front page
    When I enter invalid login details
    And submit my login request
    Then I see an error message and not get logged in