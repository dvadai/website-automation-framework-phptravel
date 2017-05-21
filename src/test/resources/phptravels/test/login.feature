Feature: Login
  As a user
  I would like to log in
  So I can use the site

  Scenario: User is able to log in with valid credentials
    Given I am on the front page
    When I enter my login details
    And submit my login request
    Then I am logged in


